import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        String personalized = myGreet("Shivam");
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        String message = "Hello" + name;
        return message;
    }
}
