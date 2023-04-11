def call() {
  //def utils = load "utils/helper.groovy"
  def randNum = src.utils.getRandNum()
  return "Hello! Your lucky number is ${randNum}."
}
