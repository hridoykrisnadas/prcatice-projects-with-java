
package problem;

import java.util.Scanner;


public class Problem {

    
    static Scanner n = new Scanner(System.in);

    public static void main(String[] args) {
        

        System.out.println("Please Enter numbers");
        int a;
        a = n.nextInt();
        int i = 0;

        if (a > 0) {
            System.out.println("The Number is Positive");

        } else if (a < 0) {
            System.out.println("The Number is Negative");

        } else {
            System.out.println("The Number is Invalid");

        }
        while (a > 0) {
            a = a / 10;
            i++;

        }
        System.out.println();
        System.out.println("Number of digit: " + i);
       ayoton();
    }

    public static void ayoton() {
        int i = 0;
        System.out.println("Please Enter Lenth");
        int b = n.nextInt();
        System.out.println("Please Enter Width");
        int c = n.nextInt();
        System.out.println("Please Enter Height");
        int d = n.nextInt();
        int ayoton = b * c * d;
        System.out.println("The Result is: " + ayoton);

    }

}
