pipeline{
    agent any
    tools{
      maven 'Maven'
    }
    stages{
        stage('Build maven'){
            steps{
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kishor-shinde-96/Spring_D_J']])
               bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
               bat 'docker build -t dj/devops-integration .'
                }
            }
        }
    }
}