public class MInNum {

    static void main() {


        int[] arr = {1, 3, 5, 9, 0, -2, 5, -10};
        int num = FindMin(arr);
        System.out.print(num);
    }

    static int FindMin(int[] arr) {
        int min = arr[0];


       for (int i=0; i<arr.length; i++) {
           int element = arr[i];
           if (arr[i] < min) {
               min = arr[i];
           }
       }
        return min;
    }

}
