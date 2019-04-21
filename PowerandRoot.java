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
public class PowerandRoot {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a;
        System.out.println("Please Input  value of a");
        a = s.nextInt();
        int b;
        System.out.println("Please input value of b");
        b = s.nextInt();
        System.out.println("For (a+b)^3");
        int aplusbq;
        aplusbq = a * a * a + 3 * a * a * b + 3 * a * b * b + b * b * b;
        System.out.println("(a+b)^3 =" + aplusbq);
        int aplusbholeq;
        aplusbholeq = (int) Math.pow(a, 3) + 3 * (int) Math.pow(a, 2) * b + 3 * a * (int) Math.pow(b, 2) + (int) Math.pow(b, 3);
        System.out.println("The Result is= " + aplusbholeq);
        int Aplusbq;
        Aplusbq = (int) Math.pow((a + b), 3);
        System.out.println("The Resut of Aplusbq is= " + Aplusbq);
        int anusidh;
        anusidh = (int) Math.pow(a, 3) + (int) Math.pow(b, 3) + 3 * a * b * (a + b);
        System.out.println("Yor Anusidhanto is+ " + anusidh);

        System.out.println("For (a-b)^3");
        int aminusb;
        aminusb = a * a * a - 3 * a * a * b + 3 * a * b * b - b * b * b;
        System.out.println("The aminusb is= " + aminusb);
        int Aminusb = (int) Math.pow(a, 3) - 3 * (int) Math.pow(a, 2) * b + 3 * a * (int) Math.pow(b, 2) - (int) Math.pow(b, 3);
        System.out.println("The Aminusb is " + Aminusb);
        int aminusbq = (int) Math.pow((a - b), 3);
        System.out.println("The aminusbq is= " + aminusbq);
        int anusidhminus = (int) Math.pow(a, 3) - (int) Math.pow(b, 3) - 3 * a * b * (a - b);

    }

}
