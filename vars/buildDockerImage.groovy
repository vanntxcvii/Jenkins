def call(Map config) {
    def dockerImage = config.dockerImage
    def dockerfilePath = config.dockerfilePath
    def contextPath = config.contextPath

    stage('Build Docker Image') {
        docker.build(dockerImage, "-f ${dockerfilePath} ${contextPath}")
    }
}
