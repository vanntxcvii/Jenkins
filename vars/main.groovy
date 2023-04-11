def call() {
  def num1 = getRandomNumber()
  def num2 = getRandomNumber()
  def sum = addNumbers(num1, num2)
  echo "The sum of ${num1} and ${num2} is ${sum}"
}
