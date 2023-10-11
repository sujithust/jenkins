// my-shared-library/vars/checkFileExistence.groovy

def call(String fileName) {
    try {
        if (isFileExists(fileName)) {
            echo "File '$fileName' exists. Performing some action..."
            // You can add more steps to perform actions when the file exists
        } else {
            echo "File '$fileName' does not exist. Displaying an error message..."
            // You can add more steps for handling the absence of the file
        }
        
        // Intentionally trigger an exception for testing
        def nonExistentFile = new File('/path/to/nonexistentfile.txt')
        nonExistentFile.text // This line will generate an exception
    } catch (Exception e) {
        currentBuild.result = 'FAILURE'
        echo "Error: An error occurred while checking the file existence - ${e.getMessage()}"
    }
}

def isFileExists(fileName) {
    return fileExists(fileName)
}


// @Library('sujith') _

// pipeline {
//     agent any
//     stages {
//         stage('Check File Existence') {
//             steps {
//                 hello_if_else_try_catch('file.txt')
//             }
//         }
//     }
// }


// `e.getMessage()` is a common method for retrieving the error message associated with an exception in Groovy and many other programming languages. However, there are other methods and properties that can provide additional information about an exception, depending on the specific exception class.

// Here are some common methods and properties you might find in Groovy when working with exceptions:

// 1. `getMessage()`: Retrieves a string that provides a human-readable description of the exception. This is the most commonly used method to get the error message.

// 2. `getCause()`: Returns the cause of the exception, which is another exception that caused the current one.

// 3. `getStackTrace()`: Returns an array of `StackTraceElement` objects representing the stack trace of the exception. This can be used to inspect the call stack at the point where the exception was thrown.

// 4. `printStackTrace()`: Prints the stack trace of the exception to the standard error stream. This is helpful for debugging and identifying where the exception occurred.

// 5. `getClass()`: Returns the class of the exception, which can be used to identify the specific exception type.

// The exact methods available may vary depending on the exception class. It's a good practice to refer to the documentation of the specific exception class you're working with to understand the available methods and properties for error handling and reporting.
