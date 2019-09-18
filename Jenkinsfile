pipeline {
   agent any
   stages {
      stage('GIT STAGE') {
         steps {
               git poll: false, url: 'https://github.com/patrykszczur94/spring-demo.git'
         }
      }
       stage('maven') {
            steps {
                sh "mvn clean install"
            }

            tools {
                 maven 'mvn3.6.2'
            }
        }
   }
   post {
    always {
        junit '**/target/surefire-reports/*.xml'  }
    }
}