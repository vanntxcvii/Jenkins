pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        build()
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
