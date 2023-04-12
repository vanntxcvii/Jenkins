def call() {
    stage('Build Image') {
        docker.build('myapp:latest')
    }
}
