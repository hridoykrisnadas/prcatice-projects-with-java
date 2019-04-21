/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.day;

import java.util.Scanner;

/**
 *
 * @author PS
 */
public class SSWork {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Please Enter Three Number");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a < b && a < c) {
            System.out.println("The heighest Number is: " + a);
        } else if (b < c && b < a) {
            System.out.println("The heighest Number is: " + b);
        } else if (c < a && c < b) {
            System.out.println("The heighest Number is: " + c);
        }
    }
}
