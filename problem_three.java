
package problem;

import java.util.Scanner;


public class problem_three {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
       System.out.println("Please enter n value");
        int n;
        n = s.nextInt();
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
    

   