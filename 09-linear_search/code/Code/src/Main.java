//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    int[] nums = {5,7,9,5,3,70,56,23,0};
    int target = -1;
    int index = linearSearch2(nums,target);
    System.out.println(index);

}
//    static int linearSearch (int[] arr, int target) {
//        int n = arr.length;
//        if (n == 0) {
//            return -1;
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }

static int linearSearch2 (int[] arr, int target) {
    int n = arr.length;
    if (n == 0) {
        return Integer.MAX_VALUE;
    }

    for (int i = 0; i < n; i++) {
       int element = arr[i];
        if (element == target) {
            return element;
        }
    }
    return Integer.MAX_VALUE;
}




