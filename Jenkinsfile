@Library('my-shared-library') _

pipeline {
    agent any

    stages {
        stage('myStep') {
            steps{
                myStep('VanNT')
            }
        }
        stage('Hello') {
            steps {
                script {
                    def message = mySharedLibrary.vars.myMethod()
                    echo message
                }
            }
        }
    }
}
