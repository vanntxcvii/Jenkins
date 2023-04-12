def call() {
    stage('Deploy Image') {
        docker.withRegistry('https://hub.docker.com', 'dockerhublogin') {
            docker.image('myapp:latest').push()
        }
    }
}
