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
public class laws {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        Double g;
        Double h;
        int q;
        System.out.println("Please Enter value of a");
        a = s.nextInt();
        System.out.println("Please enter value of b");
        b = s.nextInt();
        int aplusbsqre;
        aplusbsqre = a * a + 2 * a * b + b * b;
        System.out.println("Your aplusbsqre is = " + aplusbsqre);
        int aminusb;
        aminusb = a * a - 2 * a * b + b * b;
        System.out.println("Your Minus answer is = " + aminusb);
        int asqreminusbsqre;
        asqreminusbsqre = a + b * a - b;
        System.out.println("Your asqreminusbsqre is = " + asqreminusbsqre);
        System.out.println("Please enter your value of g");
        g = s.nextDouble();
        System.out.println("Please enter your value of h");
        h = s.nextDouble();
        Double triangle;
        triangle = .5 * g * h;
        System.out.println("Your Triangle Number is = " + triangle);
        System.out.println("Please enter your value of q");
        q = s.nextInt();
        int sqre;
        sqre = q * q;
        System.out.println("Your Square is = " + sqre);

    }
}
