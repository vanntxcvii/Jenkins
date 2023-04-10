def sayHelloAndGoodbye(name) {
  def hello = load 'hello.groovy'
  def goodbye = load 'goodbye.groovy'
  def helloMessage = hello.sayHello(name)
  def goodbyeMessage = goodbye.sayGoodbye(name)
  return "${helloMessage}\n${goodbyeMessage}"
}
