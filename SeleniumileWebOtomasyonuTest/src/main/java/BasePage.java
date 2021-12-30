import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage { // Page Object Model Design Yapıcam. Diğer Sayfalara bağlamak için kullanıcam.Diğer sayfalar bu BasePage'i extend edecek ve metotlarını kullanacak.
//Kod tekrarı yapmamak için (SOLID prensibi)

    WebDriver driver;

    public  BasePage(WebDriver driver){ //Constructer oluşturulması
        this.driver = driver;
    }

    public WebElement find(By locator){
       return driver.findElement(locator);

    }
    public List<WebElement> findAll(By locator){ // Web elementi listesi dönmesini istiyorum
        return driver.findElements(locator);
    }
    public void click(By locator){
        find(locator).click(); // Elementi Bulsun ve tıklasın
    }
    public  void  type(By locator, String text){  // Elementi bulsun ve oraya birşey yazsın
        find(locator).sendKeys(text); //senKeys ile yazdırıcaz.
    }
    public boolean isDisplayed(By locator){ // Görünüp görünmediğine bakalım
        return find(locator).isDisplayed();
    }






}
