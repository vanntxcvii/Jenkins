def call() {
  def app_name = "my-python-app"
  def app_version = "1.0.${env.BUILD_NUMBER}"
  def docker_tag = "${app_name}:${app_version}"
  def docker_registry_url = "https://hub.docker.com/"
  def docker_push_credential_id = "dockerhublogin"

  docker.withRegistry(docker_registry_url, docker_push_credential_id) {
    def customImage = docker.image(docker_tag)
    customImage.push()
  }
}
