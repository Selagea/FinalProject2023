package testCases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginAccountPages;

public class LoginAccountTestCase extends BasePage {
    LoginAccountPages loginAccountPages;


    private String loginPageURL = "https://ecommerce-playground.lambdatest.io/index.php?route=account/login";
    private String logoutPage = "https://ecommerce-playground.lambdatest.io/index.php?route=account/logout";

    @BeforeClass
    public void beforeMethod() {
        System.out.println("Navigate to " + loginPageURL);
        driver.manage().window().fullscreen();
        driver.get(loginPageURL);
        driver.manage().window().fullscreen();
        loginAccountPages = new LoginAccountPages(driver);
    }

    @Test
    public void LoginAccount() throws InterruptedException {
        loginAccountPages.insertEmail();
        loginAccountPages.insertPassword();
        loginAccountPages.clickLogin();
    }

    @Test
    public void LoginAccountWithoutEmail() throws InterruptedException {
        driver.get(logoutPage);
        driver.get(loginPageURL);
        loginAccountPages.insertPassword();
        loginAccountPages.clickLogin();
    }

    @Test
    public void LoginAccountWithoutPassword() throws InterruptedException{
        loginAccountPages.insertEmail();
        loginAccountPages.clickLogin();
    }
}
