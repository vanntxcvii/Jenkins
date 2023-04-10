def call(String imageName) {
  sh "docker run -d -p 8000:8000 $imageName"
}
