def call(String appUrl) {
  sh "curl -sSf $appUrl > /dev/null"
}
