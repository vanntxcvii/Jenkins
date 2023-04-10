@Library('my-shared-library') _

pipeline {
    agent any
    
    stages {
        stage('Build Test Environment') {
            steps {
                script {
                    buildTestEnvironment()
                }
            }
        
        }

        stage('Set Build Number') {
            steps {
                script {
                    def buildNumber = 123
                    setBuildNumber(buildNumber)
                }
            }
        }
        
        stage('Get Value') {
            steps {
                script {
                    echo getValue()
                }
            }
        }
    }
}
