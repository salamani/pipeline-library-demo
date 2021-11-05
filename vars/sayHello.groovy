#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  properties([
                        parameters([string(name:'CURRENCY_VERSION1',defaultValue:"test",description:'Currency version'),
                                   string(name:'NODES1',defaultValue:"test",description:'Nodes'),
                                   string(name:'PRIVATE_RUN_REASON1',defaultValue:"test",description:'Private run reason'),
                                   string(name:'PUBLISHED_VERSION1',defaultValue:"test",description:'Published version',readOnly:true) ])
                ])
}

