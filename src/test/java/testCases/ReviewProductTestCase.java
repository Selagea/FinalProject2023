package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ReviewProductPages;

public class ReviewProductTestCase extends BasePage {
    private ReviewProductPages reviewProductPages;

    private String loginPageURL = "https://ecommerce-playground.lambdatest.io/index.php?route=account/login";
    private String logoutPage = "https://ecommerce-playground.lambdatest.io/index.php?route=account/logout";

    @BeforeClass
    public void beforeMethod() {
        System.out.println("Navigate to " + loginPageURL);
        driver.get(loginPageURL);
        driver.manage().window().maximize();
        reviewProductPages = new ReviewProductPages(driver);
    }
    @Test
    public void ReviewProduct() throws InterruptedException{
        reviewProductPages.insertEmail();
        reviewProductPages.insertPassword();
        reviewProductPages.clickLogin();
        Thread.sleep(1000);
        reviewProductPages.clickHome();
        reviewProductPages.clickOnProduct();
        reviewProductPages.clickOnReviews();
        Thread.sleep(3000);
        reviewProductPages.insertYourName();
        reviewProductPages.insertYourReview();
        reviewProductPages.clickOnReviewButton();
        Thread.sleep(3000);
}
}
