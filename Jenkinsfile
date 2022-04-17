pipeline {
    agent any
    
    stages {
        stage('git repo & clean') {
            steps {
                //bat "git clone https://github.com/AliaksandraRyzhyk/AssessmentJ2Maven.git"
                bat "mvn clean"
            }
        }
        
        stage('test') {
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
