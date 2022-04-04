pipeline {
    agent any


environment{
M2_HOME='D:\\apache-maven-3.8.5'
PATH = "${M2_HOME}\\bin;${env.PATH};C:\\Windows\\System32;"
}
    stages {
        stage('Check out') {
        steps {
            echo 'Checking out'
                }
        }
        stage('Package') {
            steps {
            bat 'mvn clean package'
                }
        }
        stage('JaCoCo Report') {
            steps {
            jacoco()
                }
        }
    }
}
