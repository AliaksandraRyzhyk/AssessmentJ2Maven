pipeline {
    agent any
    
    stages {
        stage('git repo & clean') {
            steps {
                bat "git clone https://github.com/AliaksandraRyzhyk/AssessmentJ2Maven.git"
                bat "mvn clean"
            }
        }
        
        stage('test') {
            steps {
                bat "mvn test"
            }
        }
        stage('package') {
            steps {
                bat "mvn package"
            }
        }
    }
    post {
        failure {
            mail to: ryzhikai@rambler.ru, subject: 'The Pipeline failed :('
        }
        success {
            mail to: aliaksandraryzhyk@gmail.com, subject: 'The Pipeline passed )))'
        }
    }
}
