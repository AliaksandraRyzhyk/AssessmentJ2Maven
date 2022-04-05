pipeline {
    agent any

    stages {
        stage('Compile Stage') {

            steps {
                withMaven (maven:'maven 3.8.1')
                bat 'mvn clean compile'
            }
        }
    }

    stages {
            stage('Testing Stage') {

                steps {
                    withMaven (maven:'maven 3.8.1')
                    bat 'mvn test'
                }
            }
        }

    stages {
            stage('Deployment Stage') {

                 steps {
                      withMaven (maven:'maven 3.8.1')
                        bat 'mvn deploy'
                    }
                }
            }
}
