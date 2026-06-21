import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
//        fun(11,12,14,24,51,5456,651,5,133,556,2);
        multiple(10,20,"Hello","ufgdc" , "dfsg");
    }
//    public static void fun(int ...v){ // can pass  n numbers without a limit
//        System.out.println(Arrays.toString(v));
//    }

    static void multiple(int a,int b , String... str) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(str));

    }
}


