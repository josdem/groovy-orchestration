class PropertiesReader {

  String path = "${System.getProperty('user.dir')}/src/main/resources/qa.properties"
  Properties props = new Properties()
  File propsFile = new File(path)

  def getProperty(String key){
    props.load(propsFile.newDataInputStream())
    props.getProperty(key)
  }

}
