package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CreateRegisterAccountPages extends BasePage {
    public CreateRegisterAccountPages( WebDriver driver ) {

        this.driver = driver;
    }


    private By firstNameInput = By.id("input-firstname");
    private By lastNameInput = By.id("input-lastname");
    private By emailInput = By.id("input-email");
    private By telephoneInput = By.id("input-telephone");
    private By passwordInput = By.id("input-password");
    private By passwordConfirmInput = By.id("input-confirm");
    private By privacyPolicyCheckbox = By.xpath("//label[@for='input-agree']");
    private By continueButton = By.xpath("//input[@value='Continue']");


    public void insertFirstName() {
        driver.findElement(firstNameInput).sendKeys( "Alin");}

    public void insertLastName() {
        driver.findElement(lastNameInput).sendKeys("Cristea"); }

    public void insertEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
    }




    public void insertPhoneNumber() {
        driver.findElement(telephoneInput).sendKeys("0754165262"); }

    public void setPassword() {
        driver.findElement(passwordInput).sendKeys("852852");
    }

    public void setPasswordConfirm() {
        driver.findElement(passwordConfirmInput).sendKeys("852852"); }

    public void checkPrivacyPolicy() {
        driver.findElement(privacyPolicyCheckbox).click(); }

    public void clickContinue() {
        driver.findElement(continueButton).click(); }



    }






