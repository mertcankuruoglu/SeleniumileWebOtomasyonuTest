import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log { // Log mekanizmasının oluşturulması
  static Logger logger = Logger.getLogger(Log.class);

  public Log(){
    DOMConfigurator.configure("log4j.xml");
  }
  public void info(String mesaj){
    logger.info(mesaj);
  }
  public void warn(String mesaj){ // Uyarı logu oluşturdum
    logger.warn(mesaj);
  }
  public void error(String mesaj){
    logger.error(mesaj);
  }
}
