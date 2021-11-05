#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  String cronVal = 'H H * * *'
  
  properties([
                        parameters([string(name:'CURRENCY_VERSION1',defaultValue:"test",description:'Currency version'),
                                   string(name:'NODES1',defaultValue:"test",description:'Nodes'),
                                   string(name:'PRIVATE_RUN_REASON1',defaultValue:"test",description:'Private run reason'),
                                   string(name:'PUBLISHED_VERSION1',defaultValue:"test",description:'Published version') ]),
                        buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '60', numToKeepStr: '50')),
                        disableConcurrentBuilds(),
                        durabilityHint('PERFORMANCE_OPTIMIZED'),
                        pipelineTriggers([cron(cronVal)]),
                        [$class: 'JobPropertyImpl', throttle: [count: 24, durationName: 'hour', userBoost: true]]
                ])
 echo scm.getUserRemoteConfigs()[0].getUrl()
}

