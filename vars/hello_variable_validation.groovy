//def call(String name = 'sujith', def dayOfWeek = 1) { //Defaultvalue declared here
def call(String name, def dayOfWeek) {
    // Validate the 'name' and 'dayOfWeek' parameters
    if (isString(name) && isInteger(dayOfWeek)) {
        // 'name' is a non-null string and 'dayOfWeek' is an integer, proceed
        sh "echo Hello World ${name}. It is day ${dayOfWeek}."
    } else {
        // Display a custom error message when inputs are not of the expected type
        error("Invalid input: 'name' must be a non-null string, and 'dayOfWeek' must be an integer.")
    }
}

// Function to check if a value is a string
def isString(value) {
    if (value instanceof String && value.trim() != '') {
        return true
    } else {
        return false
    }
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
    echo "Error: $message"
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
