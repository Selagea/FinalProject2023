package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPages extends BasePage {
    public ChangePasswordPages( WebDriver driver) {

        this.driver = driver;
    }


    private By emailInput = By.id("input-email");
    private By passwordInput = By.id("input-password");
    private By loginButton = By.xpath(".//input[@value = 'Login']");
    private By PasswordButton =By.xpath(" //*[@id=\"column-right\"]/div/a[3]");
    private By Password = By.id("input-password");
    private By PasswordConfirm = By.id("input-confirm");
    private By continueChangePassword = By.xpath("//input[@value='Continue']");


    public void insertEmail() {

        driver.findElement(emailInput).sendKeys("mirejadadaaaa@yahoo.com"); }

    public void setPassword() {

        driver.findElement(passwordInput).sendKeys("741741"); }
    public void clickLogin() {

        driver.findElement(loginButton).click(); }

    public void ClickOnPasswordButton()
    {

        driver.findElement(PasswordButton).click(); }
    public void ClickOldPassword() {

        driver.findElement(Password).sendKeys("741741"); }
    public void ClickOldPasswordConfirm() {

        driver.findElement(PasswordConfirm).sendKeys("741741"); }
    public void clickOnContinueButton() {

        driver.findElement(continueChangePassword).click(); }
    }



