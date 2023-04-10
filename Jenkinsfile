@Library('my-shared-library') _

pipeline {
  agent any

  stages {
    stage('Deploy') {
      steps {
        script {
          deploy()
        }
      }
    }

    stage('Run Tests') {
      steps {
        script {
          runTests()
        }
      }
    }
  }
}

