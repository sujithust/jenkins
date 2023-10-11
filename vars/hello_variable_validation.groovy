def call(String name, int dayOfWeek) {
    // Validate the 'name' and 'dayOfWeek' parameters
    if (isString(name) && isInteger(dayOfWeek)) {
        // 'name' is a non-null string and 'dayOfWeek' is an integer, proceed
        sh "echo Hello World ${name}. It is day ${dayOfWeek}."
    } else {
        error("Invalid input: 'name' must be a non-null string, and 'dayOfWeek' must be an integer.")
    }
}

// Function to check if a value is a string
def isString(value) {
    return value instanceof String && value.trim() // Check if it's a non-empty string
}

// Function to check if a value is an integer
def isInteger(value) {
    if (value instanceof Integer) {
        return true
    } else {
        return false
    }
}

// Function to provide a custom error message
def error(message) {
    currentBuild.result = 'FAILURE'
    error(message)
}







// @Library('sujith') _

// pipeline {
//     agent any

//     stages {
//         stage('Hello World') {
//             steps {
//                 script {
//                     hello_variable_validation('abc', 1)
//                 }
//             }
//         }
//     }
// }
