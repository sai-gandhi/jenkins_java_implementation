pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo 'Compiling Java code...'
                bat 'javac Addition.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running Java program...'
                bat 'java Addition'
            }
        }
    }
}
