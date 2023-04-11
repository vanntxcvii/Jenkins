@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Greet') {
            steps {
                script{
                    greet 'World'
                }
            }
        }

        stage('Bye') {
            steps {
                script {
                    bye 'World'
                }
            }
        }

        stage('Multiply') {
            steps {
                script {
                    def result = multiply 3, 4
                    echo "3 x 4 = ${result}"
                }
            }
        }
    }
}
