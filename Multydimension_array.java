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
public class Multydimension_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Value of Row");
        int r;
        r = s.nextInt();
        System.out.println("Please Enter Value of Colum");
        int c;
        c = s.nextInt();
        int mudarray[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Please input [] " );
                mudarray[i][j] = s.nextInt();
            }

        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Mudarray is " + "[" + i + "]" + "[" + j + "]" + " = " + mudarray[i][j]);
            }

        }

    }
}
