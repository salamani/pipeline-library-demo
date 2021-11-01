@Library('mylibrary') _

import com.cleverbuilder.GlobalVars
import com.cleverbuilder.SampleClass

pipeline {
    properties([
              parameters([string(name:'CURRENCY_VERSION',defaultValue:'test',description:'Currency version'),
              string(name:'PUBLISHED_VERSION',defaultValue:'test',description:'Published version',readOnly:true)]),
              buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '20', numToKeepStr: '30')),
              durabilityHint('PERFORMANCE_OPTIMIZED'),
              [$class: 'JobPropertyImpl', throttle: [count: 24, durationName: 'hour', userBoost: true]]
    ])
    agent any 
    stages {
        stage('Demo') {
            steps {
                echo 'Hello, world'
                sayHello 'Dave'

                echo 'The value of foo is : ' + GlobalVars.foo

                script {
                    def person = new SampleClass()
                    person.age = 21
                    person.increaseAge(10)
                    echo 'Incremented age, is now : ' + person.age
                }
            }
        }
    }
}
