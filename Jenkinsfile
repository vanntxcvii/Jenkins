@Library('my-shared-library') _

def dockerImage = 'elessarxcvii/my-python-app'
def dockerfilePath = 'app/Dockerfile'
def contextPath = 'app/'

pipeline {
    agent any

    stages {
        stage('Build Python App') {
            steps {
                script {
                   sh 'python -m pip install -r app/requirements.txt'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    buildDockerImage(dockerImage: dockerImage, dockerfilePath: dockerfilePath, contextPath: contextPath)
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                      withCredentials([sshUserPrivateKey(credentialsId: 'dockerhub_ssh_key', keyFileVariable: 'SSH_KEY_FILE')]) {
                        pushDockerImage(dockerImage: dockerImage, dockerUsername: 'elessarxcvii', dockerPassword: 'my-password')
                }
               }
            }
        }
    }
}
