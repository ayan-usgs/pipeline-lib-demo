// /vars/demoPipeline.groovy


/**
 * Do some stuff for the build
 */
def myMethod() {
    println('I would have done something.')
    println(scm.branches)
    println(scm.doGenerateSubmoduleConfigurations)
    println(scm.extensions)
    println(scm.userRemoteConfigs)
    println('skitty')
}


/**
  Run the build
 */
def call() {
    node {
        stage('clean workspace') {
            cleanWs()
        }
        stage('checkout from scm') {
            checkout scm
        }
        stage('do the build') {
            myMethod()
        }
    }
}
