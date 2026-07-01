// input n number of enteries without decelaration in array
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListEx {
    static void main() {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(62);
//        list.add(63);
//        list.add(64);
//        list.add(65);
//        list.add(625);
//        list.add(125);
//
//        System.out.println(list.contains(624));
//        list.set(0,624);
//        list.remove(2);

//        System.out.print(list);

        // input
        for(int i=0; i<5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for(int i=0; i<5; i++) {
            list.add(list.get(3)); // pass the index
        }
        System.out.println(list);

    }

}
