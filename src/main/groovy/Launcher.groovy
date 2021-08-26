def utils = new Utils()
def propertiesReader = new PropertiesReader()

println "hello world from groovy version ${GroovySystem.version}"
println "Phone generated: ${utils.generatePhone()}"
println "Username from properties: ${propertiesReader.getProperty('username')}"
