@Library('shared-library') _

pipeline {
    agent any
    
    stages {
        stage('Greet') {
            steps {
                greet('Jenkins')
            }
        }
        stage('Message') {
            steps {
                def message = message()
                echo message
                echo utils.format(message)
            }
        }
    }
}
