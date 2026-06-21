import  java.util.Scanner;

public class Temp {
    static void main() {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the temp in C: ");
        float tempC = in.nextFloat();
        float tempf = (tempC * 9/5) + 32;
        System.out.println("The temperature is " + tempf);
    }


}
