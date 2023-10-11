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
