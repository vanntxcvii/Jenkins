@Library('my-shared-library') _

pipeline {
  agent any
  
  stages {
    stage('Greet') {
      steps {
        script {
          def message = greet()
          echo message
        }
      }
    }
    stage('Goodbye') {
      steps {
        script {
          def message = goodbye()
          echo message
        }
      }
    }
  }
}
