import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By shippingOptionLocator = By.id("productListTitle"); // product title eğer sayfada görünüyosa
    By productNameLocator  =  By.className("m-productCard__desc"); // ürünü seçip tıklamak için
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public boolean isOnProductPage(){ // pantalon sayfasında olup olmadığımızı kontrol edelim

        return isDisplayed(shippingOptionLocator);

    }
    public  void selectProduct(int i){
       getAllProducts().get(i).click(); // i'inci indexteki ürünü al ve tıkla
    }
    private List<WebElement> getAllProducts(){ // Sayfadaki tüm elementleri bulalım
        return findAll(productNameLocator);

    }
}
