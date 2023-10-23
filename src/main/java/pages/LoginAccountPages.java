package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginAccountPages extends BasePage {
    public LoginAccountPages(WebDriver driver) {
        this.driver = driver;
    }
    private By emailInput = By.id("input-email");
    private By passwordInput = By.id("input-password");
    private By loginButton = By.xpath(".//input[@value = 'Login']");
    private By errorMessage = By.xpath(".//div[@class='alert alert-danger alert-dismissible']");

    public void insertEmail() {

        driver.findElement(emailInput).sendKeys("andreimarius@yahoo.com"); }
    public void insertPassword() {

        driver.findElement(passwordInput).sendKeys("85208520"); }
    public void clickLogin() {

        driver.findElement(loginButton).click(); }
    public String getErrorMessage() {

        return driver.findElement(errorMessage).getText(); }
}
