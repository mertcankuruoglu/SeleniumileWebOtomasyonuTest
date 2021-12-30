import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    SearchBox searchBox;
    By cartCountLocator  =  By.className("o-header__userInfo--count"); // sepetteki adet sayısını aldım.
    By cartContainerLocator = By.className("o-header__userInfo--text");
    By acceptCookiesLocator = By.id("onetrust-accept-btn-handler"); // Cookileri kabul etmek

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }
    public SearchBox searchBox(){
      return this.searchBox;
    }
    public boolean isProductCountUp(){ // sepetteki değer artmışmı diye bakıcam.

        return getCartCount()> 0; // 0' dan büyükse true dönecek.

    }
    public void goToCart(){
          click(cartContainerLocator);
    }
    private int getCartCount(){ // sepetteki sayıyı alan metod
        String count = find(cartCountLocator).getText(); // sayıyı bulup string'e çevirdim.
        return Integer.parseInt(count); //geriye int bir değer verecek.
    }
    /*
    public void acceptCookies(){
        if(isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
     */

}
