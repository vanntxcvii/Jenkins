@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Script 1') {
            steps {
                script {
                  script1.printMessage()
                }
            }
        }
        stage('Script 2') {
            steps {
                script {
                    def message = script2.getMessage()
                    echo message
                }
                
            }
        }
        stage('Script 3') {
            steps {
                script {
                    def number = script3.getNumber()
                    echo "The number is ${number}"
                }

            }
        }
        stage('Script 4') {
            steps {
                script {
                    //def script4 = loadScript("script4.groovy")
                    def result = script4.multiplyNumbers(2, 3)
                    echo "The result is ${result}"
                }
                
            }
        }
    }
}
