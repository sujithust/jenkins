def call(String fileName) {
    readSampleFunction(fileName)
}

def readSampleFunction(String fileName) {
    def fileContent = readFile(file: fileName).trim()
    return fileContent
}
