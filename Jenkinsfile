pipeline {
    agent any
    tools {
        maven 'maven 3.8.4'
    }
    stages {
        stage('Cloning git') {
            steps {
                git url: 'https://github.com/longphamit/demo-cicd-jenkins', credentialsId: 'github'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests=true '
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