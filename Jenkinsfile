pipeline {
    agent any

    environment {
        NameSpace='8030_task'
        WebServer='172.31.12.139'
        port='8030'
    }

    stages {
        stage('git'){
            steps {
                step([$class: 'WsCleanup'])
            git  poll: true,  url: 'https://github.com/Marvin5/spring-boot-basic.git', branch: 'master'
            }
        }
        stage('Sonar') {
            steps {
                sh './gradlew sonarqube'
            }
        }

        stage('test') {
            steps {
                sh './gradlew test'
            }
        }

       stage('build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh './deploy.sh'
                }
            }
        }
    }
}