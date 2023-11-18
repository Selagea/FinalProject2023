package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
        loginAccountPages = new LoginAccountPages(driver);
    }

    @Test
    public void LoginAccount() throws InterruptedException {
        loginAccountPages.insertEmail();
        loginAccountPages.insertPassword();
        loginAccountPages.clickLogin();
        driver.get(logoutPage);

        WebElement resultElement = driver.findElement(By.xpath("//p[contains(text(),'You have been logged off your account. It is now s')]"));
        String actualResultText = resultElement.getText();
        String expectedResultText = "You have been logged off your account. It is now safe to leave the computer.";
        Thread.sleep(2000);
        Assert.assertEquals(actualResultText, expectedResultText, "Account Logout as expected");
    }

    @Test
    public void LoginAccountWithoutEmail() throws InterruptedException {

        driver.get(loginPageURL);
        loginAccountPages.insertPassword();
        loginAccountPages.clickLogin();

        WebElement resultElement = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
        String actualResultText = resultElement.getText();
        String expectedResultText = "Warning: No match for E-Mail Address and/or Password.";
        Thread.sleep(2000);
        Assert.assertEquals(actualResultText, expectedResultText, "Displayed as expected");
    }

    @Test
    public void LoginAccountWithoutPassword() throws InterruptedException {
        loginAccountPages.insertEmail();
        loginAccountPages.clickLogin();

        WebElement resultElement = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
        String actualResultText = resultElement.getText();
        String expectedResultText = "Warning: No match for E-Mail Address and/or Password.";
        Thread.sleep(2000);
        Assert.assertEquals(actualResultText, expectedResultText, "Displayed as expected");
    }
}
