package scripts.linux

def call(Map config = [:]) { 
    def scriptContents = libraryResource "scripts/linux/${config.name}"    
    writeFile file: "${config.name}", text: scriptContents 
    sh "chmod a+x ./${config.name}"
    sh "./${config.name}"
}



// @Library('sujith') _

// pipeline {
//     agent any

//     stages {
//         stage('Execute Linux Script from Shared Library') {
//             steps {
//                 script {
//                      hello_linux_script(name: 'linux.sh')

//                 }
//             }
//         }
//     }
// }
////////////////////////////////////////////////////////////////////////////////////////
//linux.sh file contents
// #!/bin/bash
// ls -l
// echo hello > file.txt
// ls -l
