public class SearchInRange {
    static void main() {

    int[] arr = {5,1,32,56,7,89,45};
    int target = 32;
    int index1 = 1;
    int index2 = 4;

    int result = Search(arr,target,index1,index2);
        System.out.println(result);
    }

    static int Search(int[] arr, int target,int index1,int index2) {
        if (arr.length == 0) {
            return -1;
        }

        for(int i = index1; i<index2; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }
}
