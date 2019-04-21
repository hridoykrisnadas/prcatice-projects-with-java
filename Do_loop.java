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
public class Do_loop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        {
            System.out.println("Enter the First Number");
        }
        int i = s.nextInt();
        System.out.println("Enter the N Number");
        int N;
        N = s.nextInt();

        do {
            System.out.print("+" + i);
            i++;
            System.out.print("\n");
        } while (i < N);

    }
}
