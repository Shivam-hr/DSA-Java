
public class Reverse {
    static void main() {

        String orignal = "Java";
        StringBuilder reversed = new StringBuilder();

        for (int i = orignal.length() - 1; i >= 0; i--) {
            reversed.append(orignal.charAt(i));
        }
        System.out.println(reversed);
    }

}
