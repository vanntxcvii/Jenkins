def call(String imageName) {
  sh "sudo docker stop $(docker ps --filter ancestor=$imageName --quiet)"
}
