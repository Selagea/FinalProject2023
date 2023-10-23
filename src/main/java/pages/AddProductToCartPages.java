package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductToCartPages extends BasePage {
    public AddProductToCartPages( WebDriver driver )  {

        this.driver = driver;
    }

        private By emailInput = By.id("input-email");
        private By passwordInput = By.id("input-password");
        private By loginButton = By.xpath(".//input[@value = 'Login']");
        private By errorMessage = By.xpath(".//div[@class='alert alert-danger alert-dismissible']");
        private By homePage = By.xpath("//span[normalize-space()='Home']");
        private By HTCTouchHDProduct = By.linkText("HTC Touch HD");
        private By firstTime = By.xpath("//*[@id=\"entry_216842\"]/button");
        private By secoundTime = By.xpath("//*[@id=\"entry_216842\"]/button");
        private By cartIcon = By.xpath("//body/div[@id='notification-box-top']/div[2]/div[2]/div[2]/div[1]/a[1]");



        public void insertEmail() {

            driver.findElement(emailInput).sendKeys("andreimarius@yahoo.com"); }
        public void insertPassword() {

            driver.findElement(passwordInput).sendKeys("85208520"); }
        public void clickLogin() {

            driver.findElement(loginButton).click(); }

        public void clickHome() {

            driver.findElement(homePage).click(); }
        public void clickOnHTCTouchHD() {

            driver.findElement(HTCTouchHDProduct).click(); }
        public void clickOnAddToCarFirstTimet() {

        driver.findElement(firstTime).click(); }
        public void clickOnAddToCartSecoundTime() {

        driver.findElement(secoundTime).click(); }
        public void clickOnCartIcon() {

        driver.findElement(cartIcon).click(); }
}


