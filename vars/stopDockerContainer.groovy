def call(String imageName) {
  sh "docker stop $(docker ps --filter ancestor=$imageName --quiet)"
}
