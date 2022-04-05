pipeline {
    agent any

    stages {
        stage('Compile Stage') {

            steps {
                withMaven (maven:'maven 3.8.1')
                sh 'mvn clean compile'
            }
        }
    }

    stages {
            stage('Testing Stage') {

                steps {
                    withMaven (maven:'maven 3.8.1')
                    sh 'mvn test'
                }
            }
        }

    stages {
            stage('Deployment Stage') {

                 steps {
                      withMaven (maven:'maven 3.8.1')
                        sh 'mvn deploy'
                    }
                }
            }
}