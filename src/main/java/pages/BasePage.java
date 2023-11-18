package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.nio.file.Paths;

public class BasePage {

    protected WebDriver driver;
    private String baseURL = "https://ecommerce-playground.lambdatest.io/";
    public BasePage() {

    }
    public BasePage(WebDriver driver){
       this.driver = driver;}

    @BeforeClass

    public void setUp() {
        String driverPath = Paths.get("src/main", "resources/", "chromedriver.exe").toString();
        System.setProperty("web - driver.chrome.driver", "\"D:\\Curs testare\\chromedriver_win32\\chromedriver.exe\"");
        System.setProperty("web-driver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);

    }
    @AfterClass

    public void tearDown() {driver.quit();
    }
}
