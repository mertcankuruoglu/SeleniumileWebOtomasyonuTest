import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.engine.descriptor.TestInstanceLifecycleUtils;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
    public class BaseTest {
        WebDriver driver;

        @BeforeAll // Her testen önce bunu yap
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.beymen.com/");
            driver.manage().window().maximize(); // Ekran açıldıldıktan sonra ekranı büyütme işlemi uyguladım
        }
        @AfterAll // Herşeyden sonra
        public void tearDown(){
            driver.quit(); // Driver'ı kapatsın
        }
   /*
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver  = new ChromeDriver();

        driver.get("https://www.beymen.com/"); // beymen sayfasına gidildi
        WebElement nameElement  = driver.findElement(By.className("default-input")); // sayfada input alanı bulundu
        nameElement.click(); // input alanı tıklandı
        nameElement.sendKeys("pantalon"); // tıklanılan input alanına pantalon keywordü girildi.
        WebElement submitButton = driver.findElement(new By.ByCssSelector("btn.o-header__search"));
        submitButton.click();
    }
*/

    }

