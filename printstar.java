/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.util.Scanner;

/**
 *
 * @author PS
 */
public class printstar {

    static Scanner s = new Scanner(System.in);

    public static void main(String args[]) {

        printStars();
    }

    public static void printStars() {
        System.out.println("Please Enter Quantity of *&");
        int n;
        n = s.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*& ");
            }
            System.out.println();

        }
    }
    
    
   

}
