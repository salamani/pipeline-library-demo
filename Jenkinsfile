@Library('mylibrary') _

import com.cleverbuilder.GlobalVars
import com.cleverbuilder.SampleClass

pipeline {
    agent any
    properties([
                 parameters([string(name:'CURRENCY_VERSION',defaultValue:config.packageVersion,description:'Currency version'),
                             string(name:'NODES',defaultValue:(config.nodeName).join(", "),description:'Nodes'),
                             string(name:'PRIVATE_RUN_REASON',defaultValue:config.privateRunReason,description:'Private run reason'),
                             string(name:'PUBLISHED_VERSION',defaultValue:config.packageVersion,description:'Published version',readOnly:true) ])
                ])
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
