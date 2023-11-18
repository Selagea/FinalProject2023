package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReviewProductPages extends BasePage{
    public ReviewProductPages(WebDriver driver )  {


        this.driver = driver;
    }

    private By emailInput = By.id("input-email");
    private By passwordInput = By.id("input-password");
    private By loginButton = By.xpath(".//input[@value = 'Login']");
    private By errorMessage = By.xpath(".//div[@class='alert alert-danger alert-dismissible']");
    private By homePage = By.xpath("//span[normalize-space()='Home']");
    private By product = By.linkText("Canon EOS 5D");
    private By reviews = By.xpath("//label[normalize-space()='3']");
    private By completeReviewName = By.xpath("//input[@id='input-name']");
    private By completeYourReview = By.id("input-review");
    private By reviewButton =By.xpath("//button[@id='button-review']");







    public void insertEmail() {
        driver.findElement(emailInput).sendKeys("andreimarius@yahoo.com"); }

    public void insertPassword() {

        driver.findElement(passwordInput).sendKeys("85208520"); }
    public void clickLogin() {

        driver.findElement(loginButton).click(); }

    public void clickHome() {

        driver.findElement(homePage).click(); }
    public void clickOnProduct() {

        driver.findElement(product).click(); }
    public void clickOnReviews() {

        driver.findElement(reviews).click(); }
    public void insertYourName() {

        driver.findElement(completeReviewName).sendKeys("John"); }
    public void insertYourReview() {
        driver.findElement(completeYourReview).sendKeys("The 5D has a DIGIC II processor and a 35.8 x 23.9 mm full-frame CMOS sensor with 13.3 million pixels (12.7 megapixel effective) and a pixel density of 1.5 megapixels per square centimetre. ISO speeds from 100 to 1600 are provided, adjustable in 1/3 steps (ISO can be expanded to L: 50 or H: 3200 with a menu function)"); }
    public void clickOnReviewButton() {

        driver.findElement(reviewButton).click(); }
}



