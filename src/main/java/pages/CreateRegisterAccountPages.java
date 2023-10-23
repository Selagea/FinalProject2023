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
    private By firstNameErrorElement = By.xpath(".//input[@name = 'firstname']/following-sibling::div");

    public void insertFirstName() {

        driver.findElement(firstNameInput).sendKeys("Dan");}

    public void insertLastName() {

        driver.findElement(lastNameInput).sendKeys("Alin"); }

    public void insertEmail() {

        driver.findElement(emailInput).sendKeys("mandreimassfgzda@yahoo.com"); }
    public void insertEmail1() {

        driver.findElement(emailInput).sendKeys("12ndreimassfgzda@yahoo.com"); }
    public void insertEmail2() {

        driver.findElement(emailInput).sendKeys("21ndreimassfgzda@yahoo.com"); }
    public void insertEmail3() {

        driver.findElement(emailInput).sendKeys("31ndreimassfgzda@yahoo.com"); }
    public void insertEmail4() {

        driver.findElement(emailInput).sendKeys("41ndreimassfgzda@yahoo.com"); }
    public void insertEmail5() {

        driver.findElement(emailInput).sendKeys("51ndreimassfgzda@yahoo.com"); }
    public void insertEmail6() {

        driver.findElement(emailInput).sendKeys("61ndreimassfgzda@yahoo.com"); }
    public void insertEmail7() {

        driver.findElement(emailInput).sendKeys("71ndreimassfgzda@yahoo.com"); }

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
    public String getFirstNameErrorMessage() {

        return driver.findElement(firstNameErrorElement).getText(); }
        private By paragraphElement = By.xpath(".//h1[@class = ' page-title my-3']");

        public String getParagraphText() {
            return driver.findElement(paragraphElement).getText();
    }
}




