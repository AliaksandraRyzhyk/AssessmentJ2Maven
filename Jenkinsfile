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
        stage('Removes a directory') {
            steps {
                bat "rm -r .git"
            }
        }
        
    }
    post {
        always {
            allure([
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'target/allure-results']]
            ])
        }
    }
}
