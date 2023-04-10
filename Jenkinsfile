@Library('my-shared-library') _

pipeline {
    agent any
    
    stages {
        stage('Build Test Environment') {
            steps {
                buildTestEnvironment()
            }
        }
        
        stage('Set Build Number') {
            steps {
                def buildNumber = 123
                setBuildNumber(buildNumber)
            }
        }
        
        stage('Get Value') {
            steps {
                echo getValue()
            }
        }
    }
}
