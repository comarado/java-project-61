package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String userName = Greet.greeting();
        Engine.main(userName);
    }
}
