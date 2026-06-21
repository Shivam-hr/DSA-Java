import java.util.Scanner;

  public static void main() {
    Scanner sc = new Scanner(System.in);
//      System.out.println("Please enter a fruit: ");
//    String fruit = sc.nextLine();

//      switch (fruit) {
//          case "banana" -> System.out.println("Banana");
//          case "apple" -> System.out.println("Apple");
//          case "orange" -> System.out.println("Orange");
//          case "Grapes" -> System.out.println("Grapes");
//          default -> System.out.println("Invalid fruit");
//      }
      int week =  sc.nextInt();
      switch (week) {
          case 1 -> System.out.println("Monday");
          case 2 -> System.out.println("Tuesday");
          case 3 -> System.out.println("Wednesday");
          case 4 -> System.out.println("Thursday");
          case 5 -> System.out.println("Friday");
          case 6 -> System.out.println("Saturday");
          case 7 -> System.out.println("Sunday");
      }


}