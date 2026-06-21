import java.util.Scanner;

public static void main() {
    LeapYear();
}

static void LeapYear() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the year : ");
    int year = sc.nextInt();

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

        System.out.println("Leap year: " + year);
    } else{
        System.out.println("Not a leap year");
    }

}