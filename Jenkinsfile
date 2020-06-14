pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            echo 'Building..'
          }
        }

        stage('run 3') {
          steps {
            sh 'echo "In build"'
          }
        }

      }
    }

    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            echo 'Testing..'
          }
        }

        stage('run 2') {
          steps {
            sh 'echo "In Test"'
          }
        }

      }
    }

    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            echo 'Deploying....'
          }
        }

        stage('run3') {
          steps {
            sh 'echo "In Deploy"'
          }
        }

      }
    }

  }
}