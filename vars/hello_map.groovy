def call(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}






// @Library('sujith') _

// pipeline {
//     agent any

//     stages {
//         stage('Hello World') {
//             steps {
//                 script {
//                     hello_map(name: 'abc', dayOfWeek: 'thu')
//                 }
//             }
//         }
//     }
// }
