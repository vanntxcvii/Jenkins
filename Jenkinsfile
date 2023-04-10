@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Script 1') {
            steps {
                script1.printMessage()
            }
        }
        stage('Script 2') {
            steps {
                def message = script2.getMessage()
                echo message
            }
        }
        stage('Script 3') {
            steps {
                def number = script3.getNumber()
                echo "The number is ${number}"
            }
        }
        stage('Script 4') {
            steps {
                def script4 = loadScript("script4.groovy")
                def result = script4.multiplyNumbers(2, 3)
                echo "The result is ${result}"
            }
        }
    }
}
