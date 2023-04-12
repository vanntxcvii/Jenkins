@Library('my-shared-library') _

pipeline {
    agent any
    stages {
        stage('Build image') {
            steps {
                script {
                    buildDockerImage()
                }
            }
        }
        stage('Push image') {
            steps {
                script {
                    dockerPush()
                }
            }
        }
    }
}
