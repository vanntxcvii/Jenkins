def call(String appUrl) {
  sh "sudo curl -sSf $appUrl > /dev/null"
}
