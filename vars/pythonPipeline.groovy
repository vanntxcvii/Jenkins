def call() {

  node {
    stage('Checkout') {
      checkout scm
    }
    def p = pipelineCfg()

    docker.image('python:latest').inside() {
      stage('Test') {
        sh 'echo whoami'
        sh 'pip install -r requirements.txt'
        sh p.testCommand
      }
    }

    if (env.BRANCH_NAME == 'main' && p.deployUponTestSuccess == true) {
      docker.image(p.deployToolImage).inside {
        stage('Deploy') {
          sh "echo ${p.deployCommand} ${p.deployEnvironment}"
        }
      }
    }
  }
}