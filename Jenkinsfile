@Library('my-shared-library') _

def imageName = 'my-image'
def dockerfilePath = 'Dockerfile'
def contextPath = '.'
def dockerArgs = ''

def registryUrl = 'my-registry.com'
def registryCredentialsId = 'my-registry-credentials'

pipeline {
    agent any

    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    buildDocker(imageName, dockerfilePath, contextPath, dockerArgs)
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    dockerPush(imageName, registryUrl, registryCredentialsId)
                }
            }
        }
    }
}




