class PropertiesReader {

  String path = 'resources/qa.properties'
  private Properties props = new Properties()
  File propsFile = new File(path)
  props.load(propsFile.newDataInputStream())

  def getProperty(String key) {
    props.getProperty(key)
  }

}
