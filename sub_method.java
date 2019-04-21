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
public class sub_method {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        first();
        sub_method m = new sub_method();
        m.second();
        
        System.out.println("The Answer Is: "+Third());
                
        

    }

    public static void first() {
        System.out.println("Please Enter Value of a");
        int a = s.nextInt();
        System.out.println("Please Enter Value of b");
        int b = s.nextInt();
        if (a < b) {
            System.out.println("The Large Number is b");
        } else {
            System.out.println("The Large Number is a");

        }

    }

    public void second() {
        System.out.println("Please Enter Value of a");
        int a = s.nextInt();
        System.out.println("Please Enter Value of b");
        int b = s.nextInt();
        int aplusb;
        aplusb = a * a + 2 * a * b + b * b;
        System.out.println("The aplusb hole square is: " + aplusb);
        System.out.println("Please Enter Value of a");
        a = s.nextInt();
        System.out.println("Please Enter Value of b");
        b = s.nextInt();
        int aminusb = a * a - 2 * a * b + b * b;
        System.out.println("The aminusb hole square is: " + aminusb);

    }
    private static int Third(){
        System.out.println("Please Enter Value of A");
        int A=s.nextInt();
        System.out.println("Please Enter Value of B");
        int B=s.nextInt();
        int C=A*B;
        return C;
        
        
    }
}
