import org.jsoup.Connection;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;

    public class Test_Add_Product_To_Cart extends BaseTest {
        HomePage homePage; // objenin oluşturulması
        ProductsPage productsPage;
        ProductDetailPage productDetailPage;
        CartPage cartPage;
        @Test
        @Order(1)
        public void searchaProduct(){ // Ürün arama metodunun oluşturulması
            homePage = new HomePage(driver);
            //homePage.acceptCookies(); cookileri kabul etmek için oluşturdum. İstenirse kullanılabilir.
            productsPage = new ProductsPage(driver);
            homePage.searchBox().search("pantolon"); //searchBox'a gidip search yapmak istiyorum. Pantolon'u arama olarak geçicem.
            Assertions.assertTrue(productsPage.isOnProductPage(),"Not on products Page!");
        }
        @Test
        @Order(2)
        public void selectaProduct(){ // Ürüne tıklandığı anda çalışacak metod
            productDetailPage = new ProductDetailPage(driver);
            productsPage.selectProduct(1); // Product'ı seçtim
            Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),"Not on product detail page!");
        }
        @Test
        @Order(3)
        public void addToCart(){ // Ürünü Sepete ekleme
            productDetailPage.chooseBodySize();
            productDetailPage.addToCart();
            Assertions.assertTrue(homePage.isProductCountUp(),"Product count did'nt increase");  // AnaSayfadaki Değer arttımı onu kontrol et
        }
        @Test
        @Order(4)
        public void goToCart(){ // Sepete Gitme Metodu (Direk Ana Sayfa'dan gitme)
            cartPage = new CartPage(driver);
            homePage.goToCart(); // Aynı zamanda Cart Page oluşturmam lazım
            Assertions.assertTrue(cartPage.checkIfProductAdded(),"Product  did'nt add to cart"); //Ürünün eklendi mi onu kontrol et

        } // Test Design kısmı bitti
    }


