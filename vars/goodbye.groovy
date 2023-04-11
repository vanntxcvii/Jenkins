def call() {
  //def utils = load "utils/helper.groovy"
  def randNum = src.utils.getRandNum()
  return "Goodbye! Your lucky number is ${randNum}."
}
