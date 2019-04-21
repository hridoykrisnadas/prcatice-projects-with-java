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
public class for_loop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        {
            System.out.println("Enter the First Number");
        }
        int i = s.nextInt();
        System.out.println("Enter the N Number");
        int N;
        N = s.nextInt();
        System.out.println("Enter the inequality Number");
        int sum = 0;
        int a = s.nextInt();
        for (i = i; i <= N; i = i + a) {
            System.out.print("+" + i);
            sum = sum + i;
        }
        System.out.print("= " + sum);
        System.out.println("");
        System.out.println("Enter the First Number");
        int j = s.nextInt();
        System.out.println("Enter the N Number");
        int k;
        k = s.nextInt();
        System.out.println("Enter the inequality Number");
        int l = s.nextInt();
        int multy = 1;

        for (j = j; j <= k; j = j * l) {
            System.out.print("x" + j);
            multy = multy * j;
        }
        System.out.print("= " + multy);

    }

}
