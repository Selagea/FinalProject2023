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
    private By SamsungGalaxyTab = By.linkText("Samsung Galaxy Tab 10.1");
    private By reviews = By.xpath("//label[normalize-space()='5']");
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

        driver.findElement(SamsungGalaxyTab).click(); }
    public void clickOnReviews() {

        driver.findElement(reviews).click(); }
    public void insertYourName() {

        driver.findElement(completeReviewName).sendKeys("John"); }
    public void insertYourReview() {
        driver.findElement(completeYourReview).sendKeys("The Samsung Galaxy Tab 10.1 is a sleek and powerful Android tablet. With a large 10.1-inch display, it offers vibrant visuals and a smooth user experience. Its slim design makes it highly portable, while the robust performance and long battery life are great for productivity and entertainment. Overall, it's a top-tier tablet choice for those seeking a premium Android experience."); }
    public void clickOnReviewButton() {

        driver.findElement(reviewButton).click(); }
}



