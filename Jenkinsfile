@Library('my-shared-library') _

pipeline {
    agent {
        dockerfile {
            filename 'Dockerfile'
        }
    }
    stages {
        stage('Build') {
            steps {
                script {
                    checkout scm
                    sh 'python setup.py sdist bdist_wheel'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sh 'python setup.py test'
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    sh 'python deploy.py'
                }
            }
        }
    }
}
