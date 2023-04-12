def call(String imageName, String dockerfilePath, String contextPath, String dockerArgs = '') {
    def dockerBuildCommand = "docker build ${dockerArgs} -t ${imageName} -f ${dockerfilePath} ${contextPath}"
    sh "${dockerBuildCommand}"
}
