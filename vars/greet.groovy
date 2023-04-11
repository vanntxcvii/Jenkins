def call() {
  def utils = load "utils/helper.groovy"
  def randNum = utils.getRandNum()
  return "Hello! Your lucky number is ${randNum}."
}
