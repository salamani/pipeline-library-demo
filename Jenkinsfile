@Library('mylibrary') _

pipeline {
    agent any
    environment {
        CI = 'true'
    }
    stages {
        stage('Build') {
            steps {
                script {
                    echo "Hello World!"
                }
            }
        }
    }
}
