package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditAccountPages  extends BasePage {
    public EditAccountPages (WebDriver driver) {

        this.driver = driver;
    }
    private By emailInput = By.id("input-email");
    private By passwordInput = By.id("input-password");
    private By loginButton = By.xpath(".//input[@value = 'Login']");
    private By EditAcoount = By.xpath("//a[normalize-space()='Edit Account']");
    private By EditFirstName = By.id("input-firstname");
    private By EditLastName = By.id("input-lastname");
    private By EditTelephone = By.id("input-telephone");
    private By ClickContinue = By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");


    public void insertEmail() {

        driver.findElement(emailInput).sendKeys("andreimarius@yahoo.com"); }
    public void insertPassword() {

        driver.findElement(passwordInput).sendKeys("85208520"); }
    public void clickLogin() {

        driver.findElement(loginButton).click(); }

    public void clickEditAcoount() {
        driver.findElement(EditAcoount).click(); }
    public void clearFirstName() {
        driver.findElement(EditFirstName).clear();}
    public void clearLastName(){
        driver.findElement(EditLastName).clear();}

    public void clearTelephone() {
        driver.findElement(EditTelephone).clear(); }

    public void insertNewFirstName() {
        driver.findElement(EditFirstName).sendKeys("Cristi");
    }
    public void insertNewLastName() {
        driver.findElement(EditLastName).sendKeys("Mogosan"); }

    public void insertNewTelephone() {
        driver.findElement(EditTelephone).sendKeys("0745132667"); }
    public void clickOnContinue() {
        driver.findElement(ClickContinue).click();
    }}
