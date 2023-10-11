def call(String fileName) {
    readSampleFunction(fileName)
}

def readSampleFunction(String fileName) {
    def fileContent = readFile(file: fileName).trim()
    return fileContent
}



// @Library('sujith') _

// pipeline {
//     agent any

//     stages {
//         stage('Execute Linux Script from Shared Library') {
//             steps {
//                 script {
//                     def content = file_read('/var/lib/jenkins/workspace/sample/file.txt')
//                     echo "File Content: ${content}"
//                 }
//             }
//         }
//     }
// }

