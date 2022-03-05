pipeline {
    agent any
    stages {
        stage('Cloning git') {
            steps {
                git url: 'https://github.com/longphamit/demo-cicd-jenkins', credentialsId: 'github'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}