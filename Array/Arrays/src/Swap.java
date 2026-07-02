import java.util.Arrays;

public class Swap {
    static void main() {
        int[] arr = {1,5,7,9,12,56};
        swap(arr, 0 ,2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr , int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }
}
