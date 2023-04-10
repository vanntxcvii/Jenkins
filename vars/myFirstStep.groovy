// vars/myFirstStep.groovy
def call() {
  def result = mySecondStep(myParam: "Hello from myFirstStep")
  echo "Result from mySecondStep: ${result}"
}
