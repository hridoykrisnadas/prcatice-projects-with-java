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
public class dollar {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        {
            double dollar;
            dollar = 82.95;
            System.out.println("Please Enter Your Dollar");
            Double x = s.nextDouble();
            Double Taka;
            Taka = dollar * x;
            System.out.println("Your Taka is = " + Taka);
        }
        double taka;
        taka =0.012055455093429777;
        System.out.println("Please Enter Your Taka");
        Double x;
        x = s.nextDouble();
        Double Dollar;
        Dollar = taka * x;
        System.out.println("Your Dollar is = " + Dollar);

    }
}
