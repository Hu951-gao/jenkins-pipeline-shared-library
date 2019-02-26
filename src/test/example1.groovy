package test;
import org.jenkinsci.plugins.workflow.steps.FlowInterruptedException

def echoTest(string_test) {
    return {
        sh "echo ${string_test}"
    } as Object
}

def excute() {
    stage('test'){
        echoTest('helloword')
    }
}
