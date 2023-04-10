// vars/mySecondStep.groovy
def call(Map myParam) {
  def result = myThirdStep()
  echo "Result from myThirdStep: ${result}"
  return myParam
}
