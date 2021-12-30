import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {

    By searchBoxLocator  = By.className("default-input");
    By submitButtonLocator = By.className("o-header__search--btn");



    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text){
      type(searchBoxLocator,text); // searchBoxLocator'ı bulsun oraya istediğimi yazsın.
      click(submitButtonLocator); // yazdıktan sonra gitsin tıklasın daha sonra pantolonlar açıldı.

    }
}
