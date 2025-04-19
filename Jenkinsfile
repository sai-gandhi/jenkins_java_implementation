pipeline {
    agent any

    stages {
        // stage('Clone Repo') {
        //     steps {
        //         // Replace with your actual Git repo URL
        //         git 'https://github.com/sai-gandhi/jenkins_java_implementation.git'
        //     }
        // }

        stage('Compile') {
            steps {
                echo 'Compiling Palindrome.java...'
                bat 'javac Palindrome.java'
            }
        }


        stage('Run') {
            steps {
                echo 'Running Palindrome.java...'
                bat 'java Palindrome'
            }
        }
    }
}
