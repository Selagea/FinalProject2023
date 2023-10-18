package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchProduct;

public class FirstTestCase  extends BasePage {
    private SearchProduct searchProduct;

    @BeforeClass

    public void setUp() {
        super.setUp();
        searchProduct = new SearchProduct(driver);
    }

    @Test
    public void clickOnProducts() throws InterruptedException {
        searchProduct.ClickOnFirstProduct();
    }
}
