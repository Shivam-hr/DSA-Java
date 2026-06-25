import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {

     /*
        1 2 3
        4 5 6
        7 8 9
      */

        Scanner in = new Scanner(System.in);

        //  int[][] arr = new int[3][3]
        //  int[][] arr = new int[3][] // no of colums are not complusry to declare

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int[][] arr2 = { // no of cloums can be vary
//                {1, 2, 3}, // 0th index
//                {4, 5}, // first index
//                {7, 8, 9, 10} // second index
//        };
//
//        System.out.println(arr2.length);

        int[][] arr = new int[3][];
        // input
        for (int row = 0; row < arr.length; row++) {
            //for each colum in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // output
        for (int row = 0; row < arr.length; row++) {
            //for each colum in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }


}
