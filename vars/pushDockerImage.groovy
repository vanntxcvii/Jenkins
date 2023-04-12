def call(Map config) {
    def dockerImage = config.dockerImage
    def dockerUsername = config.dockerUsername
    def dockerPassword = config.dockerPassword

    stage('Push Docker Image') {
        docker.withRegistry('https://registry.hub.docker.com', dockerUsername, dockerPassword) {
            dockerImage.push()
        }
    }
}
