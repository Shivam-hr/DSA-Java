import java.util.Arrays;
import java.util.Scanner;

// arrays is a non premitive so there should be pass by reference
public class PassinginFunction {
    static void main(String[] args) {
        int[] nums = {3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        Change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void Change(int[] arr) {
        arr[0] = 99;

    }
}
