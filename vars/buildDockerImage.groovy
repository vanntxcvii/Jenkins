def call(String imageName) {
  def dockerfile = """
    FROM alpine:latest
    RUN apk add --no-cache python3
    CMD python3 -m http.server 8000
  """
  def dockerfileWithImageName = dockerfile.replaceAll("alpine:latest", imageName)
  sh "echo '$dockerfileWithImageName' | sudo docker build -t $imageName -"
}
