package scripts.linux

def call(Map config = [:]) { 
    def scriptContents = libraryResource "scripts/linux/${config.name}"    
    writeFile file: "${config.name}", text: scriptContents 
    sh "chmod a+x ./${config.name}"
    sh "./${config.name}"
}

