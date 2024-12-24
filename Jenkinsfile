pipeline {
    agent any  // Use any available agent

    environment {
        // You can define global environment variables here
        REPO_URL = 'https://github.com/vipinec/MavenGitHubJenkinsIntegrationCICD.git'
        BRANCH_NAME = 'stage1'  // Specify the branch you want to build
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the repository from GitHub
                git url: "${REPO_URL}", branch: "${BRANCH_NAME}"
            }
        }

        stage('Build') {
            steps {
                // Example build step (you can replace it with your actual build command)
                sh 'mvn clean install'
                // You can also run Maven, Gradle, npm, etc.
               // sh 'mvn clean install'  // Example command for Maven
               // sh './mvnw clean install'

            }
        }

        stage('Test') {
            steps {
                // Run tests (replace with your actual testing commands)
               sh 'mvn test'
               // sh 'mvn test'  // Example command for Maven tests
            }
        }

        stage('Deploy') {
            steps {
                // Deploy the application (e.g., to an AWS server or internal environment)
                sh 'Deploying project...'
                // Replace with your deployment script/command
            }
        }
    }

    post {
        always {
            // Cleanup or final actions (optional)
            echo 'Cleaning up...'
        }

        success {
            // Actions on success (e.g., send notifications)
            echo 'Build and tests passed!'
        }

        failure {
            // Actions on failure (e.g., send failure notifications)
            echo 'Build failed!'
        }
    }
}
