pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        script {
          myLibrary.myBuild.build(job: 'myJob')
      }
    }
    stage('Test') {
      steps {
        test()
      }
    }
    stage('Deploy') {
      steps {
        deploy()
      }
    }
  }
  post {
    always {
      cleanup()
    }
    success {
      notify()
    }
  }
}
