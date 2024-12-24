pipeline {
    agent any


    environment {
        REPO_URL = 'https://github.com/vipinec/MavenGitHubJenkinsIntegrationCICD.git' // Replace with your GitHub repo URL
        BRANCH = 'stage1' // Branch to be cloned
    }

    stages {
        stage('Clone Repository') {
            steps {
                echo 'Cloning the repository...'
                git branch: "${BRANCH}", url: "${REPO_URL}"
            }
        }

        stage('Setup Environment') {
            steps {
                echo 'Setting up environment for Mac M1...'
                // If your project needs additional dependencies specific to Mac M1, add them here
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project with Maven...'
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the project...'
                // Add deployment steps for your live website (e.g., SCP, FTP, or API-based deployment)
                sh '''
                echo "Starting deployment..."
                # Example of deploying to a live server:
                # scp -i ~/.ssh/id_rsa target/*.war user@server:/path/to/deploy
                echo "Deployment completed."
                '''
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution completed.'
        }
        success {
            echo 'Build, test, and deployment succeeded!'
        }
        failure {
            echo 'Build or deployment failed. Check the logs for more details.'
        }
    }
}
