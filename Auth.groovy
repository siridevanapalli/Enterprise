#!/usr/bin/env groovy

// Install SFPowerkit
pipeline {
  agent any
  stages {
    stage('Authorize an Org') {
      steps {
        echo 'y' | ${toolbelt}sfdx plugins:install sfpowerkit
      }
    }
  }
}
