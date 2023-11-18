package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.EditAccountPages;



    public class EditAccountTestCase extends BasePage {
        EditAccountPages editAccountPages;


        private String loginPageURL = "https://ecommerce-playground.lambdatest.io/index.php?route=account/login";
        private String logoutPage = "https://ecommerce-playground.lambdatest.io/index.php?route=account/logout";

        @BeforeClass
        public void beforeMethod() {
            System.out.println("Navigate to " + loginPageURL);
            driver.manage().window().fullscreen();
            driver.get(loginPageURL);
            editAccountPages = new EditAccountPages(driver);
        }

        @Test
        public void EditAccount() throws InterruptedException {
            editAccountPages.insertEmail();
            editAccountPages.insertPassword();
            editAccountPages.clickLogin();
            editAccountPages.clickEditAcoount();
            Thread.sleep(2000);
            editAccountPages.clearFirstName();
            editAccountPages.clearLastName();
            editAccountPages.clearTelephone();
            Thread.sleep(3000);
            editAccountPages.insertNewFirstName();
            editAccountPages.insertNewLastName();
            editAccountPages.insertNewTelephone();
            Thread.sleep(3000);
            editAccountPages.clickOnContinue();

            WebElement resultElement = driver.findElement(By.xpath("//*[@id=\"account-account\"]/div[1]"));
            String actualResultText = resultElement.getText();
            String expectedResultText = "Success: Your account has been successfully updated.";
            Thread.sleep(2000);
            Assert.assertEquals(actualResultText, expectedResultText,"Account updated");
            Thread.sleep(3000);
            driver.get(logoutPage);
        } }