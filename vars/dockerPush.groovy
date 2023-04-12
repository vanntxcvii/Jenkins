def call(String imageName, String registryUrl, String registryCredentialsId) {
    withCredentials([string(credentialsId: registryCredentialsId, variable: 'DOCKER_REGISTRY_PASSWORD')]) {
        def dockerLoginCommand = "docker login -u _json_key --password-stdin https://${registryUrl}"
        sh "echo ${DOCKER_REGISTRY_PASSWORD} | ${dockerLoginCommand}"

        def dockerTagCommand = "docker tag ${imageName} ${registryUrl}/${imageName}"
        sh "${dockerTagCommand}"

        def dockerPushCommand = "docker push ${registryUrl}/${imageName}"
        sh "${dockerPushCommand}"
    }
}
