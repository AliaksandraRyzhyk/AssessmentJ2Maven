pipeline {
    agent any
    
    stages {
        stage('Git repo & clean') {
            steps {
                bat "git clone https://github.com/AliaksandraRyzhyk/AssessmentJ2Maven.git"
                bat "mvn clean"
            }
        }
        
        stage('Test') {
            steps {
                bat "mvn test"
            }
        } 
        stage('Email') {
            steps {
                mail bcc: '', body: '', cc: '', from: '', replyTo: '', subject: 'failed', to: 'aliaksandraryzhyk@gmail.com'
            }
        } 
        
    }
    post {
        always {
            allure([
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'target/allure-results']]
            ])
            cleanWs()
        }
    }
}
