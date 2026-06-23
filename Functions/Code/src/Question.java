import java.util.Arrays;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int a = 10;
//        int b = 20;
//        swap(a, b);
//        System.out.println("a is: " + a + " " + "b is: " + b);

//        int num1 = 10;
//        int num2 = 20;
//        swap(num1 , num2);
//        System.out.println("a is: " + num1 + " " + "b is: " + num2);

          int[] arr = {1,4,5,6,6};
          change(arr);
         System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
    }
//    static void swap(int num1 ,int num2) {
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//    }

    static void change(int [] nums) {
        nums [0] = 99 ;
    }







}
//        int n = in.nextInt();
//        System.out.println(isPrime(n));
//        for (int i = 100;  i < 1000; i++){
//            if (isAmstrong(i)) {
//                System.out.print(i + " ");
//            }
//            }
//        }



//    static boolean isAmstrong(int n) {
//        int ornignal = n;
//        int sum = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//            n = n / 10;
//            sum = sum + rem * rem * rem;
//        }
//        return sum == ornignal;
//
////    static boolean isPrime(int n) {
////        if (n <= 1) {
////            return false;
////        }
////        int c = 2;
////
////        while (c * c <=n){
////            if (n % c == 0) {
////                return false;
////            }
////            c++;
////        }
////        return true;
////    }
////}
//    }
//}


