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
public class temparature {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        {
            System.out.println("Please Enter farenhite");
            double farenhite = s.nextDouble();
            double celcious = ((farenhite - 32) * 5) / 9;
            System.out.println("The celcious is + " + celcious);
        }
        System.out.println("Please enter Your Celcious");
        double Celcious;
        Celcious = s.nextDouble();
        double Farenhite;
        Farenhite = ((Celcious * 9) / 5) + 32;
        System.out.println("The Farenhite Temparature is = " + Farenhite);

    }

}
