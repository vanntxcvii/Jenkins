@Library('my-shared-library') _

def imageName = 'my-image'
def dockerfilePath = 'Dockerfile'
def contextPath = '.'
def dockerArgs = ''

def registryUrl = 'my-registry.com'
def registryCredentialsId = 'my-registry-credentials'

stage('Build Docker Image') {
    buildDocker(imageName, dockerfilePath, contextPath, dockerArgs)
}

stage('Push Docker Image') {
    dockerPush(imageName, registryUrl, registryCredentialsId)
}
