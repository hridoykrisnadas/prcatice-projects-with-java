/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;

/**
 *
 * @author PS
 */
public class loop_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            System.out.println("Enter the First Number");
        }
        int i = s.nextInt();
        System.out.println("Enter the N Number");
        int N;
        N = s.nextInt();

        while (i <= N) {
            System.out.print("+" + i);
            i++;

        }
        System.out.print("\n");

    }

}
