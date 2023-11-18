package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.nio.file.Paths;
import java.util.Random;

public class BasePage {


    protected WebDriver driver;
    private String baseURL = "https://ecommerce-playground.lambdatest.io/";
    public BasePage() {

    }
    public BasePage(WebDriver driver){
       this.driver = driver;
            Faker faker = new Faker();
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();

            // Generate a random email address
            String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@email.com";

            // Generate a random password
            String password = generatePassword(12);

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        }

        public static String generatePassword(int length) {
            String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
            String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String digits = "0123456789";
            String symbols = "!@#$%^&*()_+{}|:<>?[]\\;/.,";

            String characters = lowercaseLetters + uppercaseLetters + digits + symbols;
            StringBuilder password = new StringBuilder();

            Random random = new Random();
            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(characters.length());
                password.append(characters.charAt(randomIndex));
            }

            return password.toString();
        }




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
