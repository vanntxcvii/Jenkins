def call() {
    def testDir = "${WORKSPACE}/test"
    sh "mkdir -p ${testDir}"
    sh "echo 'test file' > ${testDir}/test.txt"
}
