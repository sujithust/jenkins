def call(String name, int dayOfWeek) {
    // Validate the 'name' and 'dayOfWeek' parameters
    if (isString(name)) {
        // 'name' is a non-null string, proceed with the validation for 'dayOfWeek'
        if (isInteger(dayOfWeek)) {
            // 'dayOfWeek' is an integer, execute the 'sh' step
            sh "echo Hello World ${name}. It is day ${dayOfWeek}."
        } else {
            error("Invalid input: 'dayOfWeek' must be an integer.")
        }
    } else {
        error("Invalid input: 'name' must be a non-null string.")
    }
}

// Function to check if a value is a string
def isString(value) {
    return value instanceof String && value.trim() // Check if it's a non-empty string
}

// Function to check if a value is an integer
def isInteger(value) {
    return value instanceof Integer
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
