def call() {
  def utils = load "utils/helper.groovy"
  def randNum = utils.getRandNum()
  return "Goodbye! Your lucky number is ${randNum}."
}
