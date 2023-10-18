package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProduct  extends BasePage{

    public  SearchProduct(WebDriver driver) { super(driver);}

    By FirstProduct = By.id("input-search");

    public void ClickOnFirstProduct(){ driver.findElement(FirstProduct).click();}
}
