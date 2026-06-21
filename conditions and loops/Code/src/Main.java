public class Main {
    static void main(String[] args) {
        /*
            Syntax of if statement
            if (boolean condition T || F) {
                body
            } else {
                // do this
        }
         */

    int Salery = 25400;
        if(Salery >= 20000) {
            Salery += 2000;
        } else if (Salery >= 10000) {
            Salery += 1000;
        } else {
            Salery += 500;
        }

        System.out.println(Salery);
    }
}




