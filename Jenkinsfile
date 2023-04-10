@Library('my-shared-library') _

pipeline {
  agent any
  
  stages {
    stage('Build Docker Image') {
      steps {
        buildDockerImage('my-app')
      }
    }
    stage('Run Docker Container') {
      steps {
        runDockerContainer('my-app')
      }
    }
    stage('Test Application') {
      steps {
        testApp('http://localhost:8000')
      }
    }
    stage('Stop Docker Container') {
      steps {
        stopDockerContainer('my-app')
      }
    }
  }
}
