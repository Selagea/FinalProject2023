package testCases;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CreateRegisterAccountPages;

public class CreateRegisterAccountTest extends BasePage {
    private CreateRegisterAccountPages createRegisterAccountPages;
    private String registerPageURL = "https://ecommerce-playground.lambdatest.io/index.php?route=account/register";

    private String logoutPage = "https://ecommerce-playground.lambdatest.io/index.php?route=account/logout";
    @BeforeClass

    public void beforeMethod() {
        System.out.println("Navigate to " + registerPageURL);
        driver.manage().window().fullscreen();
        driver.get(registerPageURL);
        createRegisterAccountPages =  new CreateRegisterAccountPages(driver);
    }
    @Test
    public void newRegisterAccount() throws Exception {
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail();
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();
        Assert.assertEquals ("Congratulations! Your new account has been successfully created!","Congratulations! Your new account has been successfully created!");
    }

    @Test
    public void registerWithoutFirstName() {
        driver.get(logoutPage);
        driver.get(registerPageURL);
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail1();
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();
        Assert.assertEquals("Error message is not the expected one.", "Error message is not the expected one.");
    }


   @Test
    public void registerWithoutLastName() {

       driver.get(registerPageURL);
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertEmail2();
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();
        Assert.assertEquals("Last Name must be between 1 and 32 characters!" ,"Last Name must be between 1 and 32 characters!");
    }

    @Test
    public void registerWithoutEmail() {
        driver.get(registerPageURL);
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail3();
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();
        Assert.assertEquals("E-Mail Address does not appear to be valid!", "E-Mail Address does not appear to be valid!");
    }

    @Test
    public void registerWithoutPhoneNumber() {
        driver.get(registerPageURL);
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail4();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();
        Assert.assertEquals("Telephone must be between 3 and 32 characters!" ,"Telephone must be between 3 and 32 characters!");
    }

    @Test
    public void registerWithoutPassword() {
        driver.get(registerPageURL);
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail5();
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();
        Assert.assertEquals("Password must be between 4 and 20 characters!", "Password must be between 4 and 20 characters!");

    }
    @Test
    public void registerWithoutPasswordConfirm() {
        driver.get(registerPageURL);
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail6();
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.checkPrivacyPolicy();
        createRegisterAccountPages.clickContinue();
        Assert.assertEquals("Password confirmation does not match password!", "Password confirmation does not match password!");
}
    @Test
    public void registerWithoutPrivacyPolicy() {
        driver.get(registerPageURL);
        createRegisterAccountPages.insertFirstName();
        createRegisterAccountPages.insertLastName();
        createRegisterAccountPages.insertEmail7();
        createRegisterAccountPages.insertPhoneNumber();
        createRegisterAccountPages.setPassword();
        createRegisterAccountPages.setPasswordConfirm();
        createRegisterAccountPages.clickContinue();
        Assert.assertEquals("Warning: You must agree to the Privacy Policy!", "Warning: You must agree to the Privacy Policy!");
    }
    }
