/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_practice;

import java.util.Scanner;

/**
 *
 * @author hridoykrisnadas
 */
public class Cheif_Theif {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The No of A: ");
        int a = s.nextInt();
        System.out.println("Enter The No of B: ");
        int T = s.nextInt();
        for (int i = 1; i <= T; i++) {
            int n = s.nextInt();
            double sum = a / n;
            System.out.print(sum + " ");

        }

    }

}
