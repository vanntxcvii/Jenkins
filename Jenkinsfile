@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('Greet') {
            steps {
                greet 'World'
            }
        }

        stage('Bye') {
            steps {
                bye 'World'
            }
        }

        stage('Multiply') {
            steps {
                def result = multiply 3, 4
                echo "3 x 4 = ${result}"
            }
        }
    }
}
