pipeline {
    agent any
    
    stages {
        stage('Git repo & clean') {
            steps {
                bat "rm -rf .git"
                bat "git clone https://github.com/AliaksandraRyzhyk/AssessmentJ2Maven.git"
                bat "mvn clean"
            }
        }
        
        stage('Test') {
            steps {
                bat "mvn test"
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
