def call() {
  def app_name = "my-python-app"
  def app_version = "1.0.${env.BUILD_NUMBER}"
  def docker_tag = "${app_name}:${app_version}"

  docker.withRegistry(docker_registry_url) {
    def customImage = docker.image(docker_tag)
    customImage.push()
  }
}
