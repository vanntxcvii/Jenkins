pipeline {
    agent any

    stages {
        stage('Build and Push Docker Image') {
            steps {
                sh 'docker build -t my-jenkins-image .'
                sh 'sh scripts/login_to_dockerhub.sh'
                sh 'docker tag my-jenkins-image elessarxcvii/my-jenkins-image'
                sh 'docker push elessarxcvii/my-jenkins-image'
            }
        }
    }
}
