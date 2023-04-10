@Library('my-shared-library') _

pipeline {
  agent any

  stages {
    stage('Build Docker Image') {
      steps {
        buildDockerImage('my-app')
      }
    }
    
  }
}
