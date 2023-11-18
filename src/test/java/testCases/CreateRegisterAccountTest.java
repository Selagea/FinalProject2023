package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CreateRegisterAccountPages;

import static RandomEmail.Email.generateRandomEmail;

public class CreateRegisterAccountTest extends BasePage {
    private CreateRegisterAccountPages createRegisterAccountPages;
    private String registerPageURL = "https://ecommerce-playground.lambdatest.io/index.php?route=account/register";

    private String logoutPage = "https://ecommerce-playground.lambdatest.io/index.php?route=account/logout";
    @BeforeClass

    public void beforeMethod() {
        System.out.println("Navigate to " + registerPageURL);

        driver.manage().window().maximize();
        driver.get(registerPageURL);
        createRegisterAccountPages =  new CreateRegisterAccountPages(driver);
    }
    @Test
    public void newRegisterAccount() throws Exception {
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail(generateRandomEmail());
        Thread.sleep(2000);
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();

    }

    @Test
    public void registerWithoutFirstName()  throws Exception{
        driver.get(logoutPage);
        driver.get(registerPageURL);
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail(generateRandomEmail());
        Thread.sleep(2000);
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();

        WebElement resultElement = driver.findElement(By.xpath("//div[@class='text-danger']"));
        String actualText = resultElement.getText();
        String expectedText = "First Name must be between 1 and 32 characters!";
        Thread.sleep(2000);
        Assert.assertEquals(actualText, expectedText,"Displayed as expected");
    }


   @Test
    public void registerWithoutLastName() throws Exception{

       driver.get(registerPageURL);
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertEmail(generateRandomEmail());
       Thread.sleep(2000);
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();

        WebElement resultElement = driver.findElement(By.xpath("//div[@class='text-danger']"));
        String actualText = resultElement.getText();
        String expectedText = "Last Name must be between 1 and 32 characters!";
       Thread.sleep(2000);
       Assert.assertEquals(actualText,expectedText,"Displayed as expected");
          }


    @Test
    public void registerWithoutPhoneNumber() throws Exception{
        driver.get(registerPageURL);
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail(generateRandomEmail());
        Thread.sleep(2000);
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();

        WebElement resultElement = driver.findElement(By.xpath("//div[@class='text-danger']"));
        String actualText = resultElement.getText();
        String expectedText = "Telephone must be between 3 and 32 characters!";
        Thread.sleep(2000);
        Assert.assertEquals(actualText,expectedText,"Displayed as expected");
    }

    @Test
    public void registerWithoutPassword() throws Exception{
        driver.get(registerPageURL);
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail(generateRandomEmail());
        Thread.sleep(2000);
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();

        WebElement resultElement = driver.findElement(By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]"));
        String actualText = resultElement.getText();
        String expectedText = "Password must be between 4 and 20 characters!";
        Thread.sleep(2000);
        Assert.assertEquals(actualText,expectedText,"Displayed as expected");

    }
    @Test
    public void registerWithoutPasswordConfirm() throws Exception {
        driver.get(registerPageURL);
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail(generateRandomEmail());
        Thread.sleep(2000);
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();

        WebElement resultElement = driver.findElement(By.xpath("//div[@class='text-danger']"));
        String actualText = resultElement.getText();
        String expectedText = "Password confirmation does not match password!";
        Thread.sleep(2000);
        Assert.assertEquals(actualText, expectedText, "Displayed as expected");
    }
    }

