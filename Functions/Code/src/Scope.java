public class Scope {
    static void main(String[] args) {
        int a = 10;
        int b = 20;

//        System.out.println(marks); // cant access the value outside the block

//            int a = 78 // cant declare the same value agian in the same blcock
//            a = 78 ; // can change the value
        {
            int c = 70;

        }
//        System.out.println(c); // can't access the value of c
    }

    public static void random(int marks) {
        int num = 23;
        System.out.println(num);
        System.out.println(marks);
    }
}
