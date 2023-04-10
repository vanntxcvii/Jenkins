@Library('my-shared-library') _

pipeline {
  agent any
  
  stages {
    stage('Say Hello and Goodbye') {
      steps {
        script {
          def main = load 'main.groovy'
          def message = main.sayHelloAndGoodbye('John')
          println message
        }
      }
    }
  }
}

