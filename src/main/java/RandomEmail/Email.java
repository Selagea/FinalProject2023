package RandomEmail;
import java.util.Random;

public class Email {

    public static String generateRandomEmail() {
        Random random = new Random();
        String email = "johndow" + random.nextLong() + "@email.com";
        System.out.println("Used email is: " + email);
        return email;
    }
}





