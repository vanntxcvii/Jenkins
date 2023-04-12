def call() {
  def app_name = "my-python-app"
  def app_version = "1.0.${env.BUILD_NUMBER}"
  def docker_tag = "${app_name}:${app_version}"
  def dockerfile_path = "Dockerfile"
  def docker_build_args = ""
  def docker_registry_url = "https://hub.docker.com/repository/docker/elessarxcvii/my-jenkins-image"
  def docker_push_credential_id = "dockerhub_ssh_key"

  docker.withRegistry(docker_registry_url) {
    def customImage = docker.build(docker_tag, "-f ${dockerfile_path} ${docker_build_args} .")
  }
}
