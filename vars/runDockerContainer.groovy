def call(String imageName) {
  sh "sudo docker run -d -p 8000:8000 $imageName"
}
