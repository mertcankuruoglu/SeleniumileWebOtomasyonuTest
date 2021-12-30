import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{
    By chooseBodySizeLocator  = By.className("m-variation__item");
    By addToCartButtonLocator  = By.id("addBasket");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }
    public boolean isOnProductDetailPage(){
        return isDisplayed(addToCartButtonLocator); // eğer bunu görüyorsam evet bu sayfadayım demektir.
    }
    public void chooseBodySize(){
        click(chooseBodySizeLocator);
    }
    public void addToCart(){
       click(addToCartButtonLocator);
    }

}

