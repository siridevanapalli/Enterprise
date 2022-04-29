pipeline {
  agent any
  stages {
    stage('Checkout SCM') {
      steps {
        git(url: 'https://github.com/siridevanapalli/Enterprise.git', branch: 'main')
      }
    }

    stage('Authorizing an Org') {
      steps {
        load 'Enterprise/blob/main/Auth.groovy'
      }
    }

  }
}