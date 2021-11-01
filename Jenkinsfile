@Library('mylibrary') _

import com.cleverbuilder.GlobalVars
import com.cleverbuilder.SampleClass

pipeline {
    agent any

    parameters([string(name:'CURRENCY_VERSION',defaultValue:NULL,description:'Currency version'),string(name:'NODES',defaultValue:NULL,description:'Nodes'), string(name:'PUBLISHED_VERSION',defaultValue:NULL,description:'Published version',readOnly:true) ])
    
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
