
public class Main {
    public static void main(String[] args) {
        String output = "1";
        String out1 = "";
        int sFizz = 3;
        int sBuzz = 5;



        for (int i = 2; i <= 100; i++) {

            out1 = "";


            if (i % sFizz == 0) {
                out1 = out1 + "Fizz";
            }
            if (i % sBuzz == 0){
                out1 = out1 + "Buzz";
            }

            if (out1 == "") {

              out1 = "" + i;
            }

            output = output + ", " + out1;
            }


        System.out.println(output + ".");


        }

    }

