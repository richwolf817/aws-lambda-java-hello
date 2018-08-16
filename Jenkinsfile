pipeline {
  agent {
            dockerfile { 
                args '-u 0:0' //Forces Container tu run as User Root                    
                reuseNode true
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
