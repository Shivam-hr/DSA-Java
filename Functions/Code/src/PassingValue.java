

public class PassingValue {
    public static void main(String[] args) {
        String chacha = "Iron Man";
        greet(chacha); // not changed to chacha
    }

    static void greet(String naam) { // String its mutable
        System.out.println(naam);
    }
}