def call(String name, int dayOfWeek) {
    // Validate the 'name' and 'dayOfWeek' parameters
    if (isString(name) && isInteger(dayOfWeek)) {
        // If 'name' is a non-null string and 'dayOfWeek' is an integer, execute the 'sh' step
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
    try {
        Integer.parseInt(value)
        return true
    } catch (NumberFormatException e) {
        return false
    }
}

