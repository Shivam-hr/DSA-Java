import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {

    static void main() {
        int[][] arr = {
                {23,45,56},
                {8,63,78,12},
                {9,14,18,32}
        };
        int target = 32;
        int ans = max(arr);
        System.out.println(ans);
    }

//        static int[] search(int[][] arr,int target) {
//            for (int row =0; row < arr.length; row++) {
//                for (int col =0; col < arr[row].length; col++) {
//                    if (arr[row][col] == target) {
//                        return new int[]{row,col};
//                    }
//                }
//            }
//            return new int[]{-1,-1};
//    }
//}

    static int max(int[][] arr) {

        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }


    }
