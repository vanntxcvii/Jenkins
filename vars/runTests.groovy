def call() {
  // Run tests here
  echo "Running tests..."
  def testData = readJSON(file: "${WORKSPACE}/resources/test-data.json")
  echo "Test data: ${testData}"
}
