pipeline {
  agent {
    docker {
      image 'goforgold/build-container:latest'
    }
  }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deliver') {
            steps {
                sh 'terraform init'
                sh 'terraform apply'
            }
        }
    }
}
