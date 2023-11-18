package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ChangePasswordPages;


public class ChangePasswordTestCase extends BasePage {
    private ChangePasswordPages changePasswordPages;
    private String registerPageURL = "https://ecommerce-playground.lambdatest.io/index.php?route=account/register";
    private String loginPageURL = "https://ecommerce-playground.lambdatest.io/index.php?route=account/login";

    @BeforeClass

    public void beforeMethod() {
        System.out.println("Navigate to " + loginPageURL);
        driver.manage().window().fullscreen();
        driver.get(loginPageURL);
        changePasswordPages =  new ChangePasswordPages(driver);
    }
    @Test
    public void newRegisterAccount() throws Exception {
        changePasswordPages.insertEmail();
        changePasswordPages.setPassword();
        changePasswordPages.clickLogin();
        Thread.sleep(2000);
        changePasswordPages.ClickOnPasswordButton();
        changePasswordPages.ClickOldPassword();
        changePasswordPages.ClickOldPasswordConfirm();
        changePasswordPages.clickOnContinueButton();
        Thread.sleep(6000);
        Assert.assertEquals("Success: Your account has been successfully updated.", "Success: Your account has been successfully updated.");
    }
}
