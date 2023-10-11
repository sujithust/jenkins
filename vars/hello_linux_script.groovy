def call(Map config = [:]) {
    loadLinuxScript(name: '.linux.sh')
    sh "./linux.sh"
}
