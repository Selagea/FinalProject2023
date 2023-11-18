package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddProductToCartPages;
import pages.BasePage;



public class AddProductToCartTestCase  extends BasePage {
    private AddProductToCartPages addProductToCartPages;
    private String loginPageURL = "https://ecommerce-playground.lambdatest.io/index.php?route=account/login";
    private String logoutPage = "https://ecommerce-playground.lambdatest.io/index.php?route=account/logout";

    @BeforeClass
    public void beforeMethod() {
        System.out.println("Navigate to " + loginPageURL);
        driver.get(loginPageURL);
        driver.manage().window().fullscreen();
        addProductToCartPages = new AddProductToCartPages(driver);
    }

    @Test
    public void LoginAccount() throws InterruptedException{
        addProductToCartPages.insertEmail();
        addProductToCartPages.insertPassword();
        addProductToCartPages.clickLogin();
        Thread.sleep(1000);
        addProductToCartPages.clickHome();
        addProductToCartPages.clickOnHTCTouchHD();
        addProductToCartPages.clickOnAddToCarFirstTimet();
        Thread.sleep(1000);
        addProductToCartPages.clickOnAddToCartSecoundTime();
        Thread.sleep(1000);
        addProductToCartPages.clickOnCartIcon();
        Thread.sleep(4000);
    }
}
