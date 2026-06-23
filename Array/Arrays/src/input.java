import java.util.Arrays;
import java.util.Scanner;

public class input {
    static Scanner in = new Scanner(System.in);
    static void main(String[] args) {
    int[] arr = new int[5];
//    arr[0] = 1;
//    arr[1] = 45;
//    arr[2] = 12;
//    arr[3] = 212;
//    arr[4] = 412;
//
//    System.out.println(arr[2]);

    for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt(); // input the array
    }
    System.out.println(Arrays.toString(arr)); // convert into a string and then print that


//    for (int i = 0; i<arr.length; i++) {
//        System.out.print(arr[i] + " ");
//    }

        for (int num : arr) { // for every element in array , print the element
            System.out.print(num + " "); // here num represent element of the array
        }

    }

}
