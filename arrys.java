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
public class arrys {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        array = new int[5];
        System.out.println("Please input array[0]");
        array[0] = input.nextInt();
        System.out.println("Please input array[1]");
        array[1] = input.nextInt();
        array[2] = array[0] + array[1];
        array[3] = array[2] - array[1];
        array[4] = array[3] * array[2];
        System.out.print("The array[2] plus is = " + array[2] + "\n" + "The array[3] minus is = " + array[3] + "\n" + "The arry[4] multi is = " + array[4] + "\n");

        int[][] m = {{2, 3, 5},
                     {4, 5, 8},
                     {7, 5, 3}};
        int[][] tda = new int[10][10];
        tda[0][0] = 2;
        tda[0][1] = 3;
        tda[0][2] = 5;
        tda[1][0] = 4;
        tda[1][1] = 5;
        tda[1][2] = 8;
        tda[2][0] = 7;
        tda[2][1] = 5;
        tda[2][2] = 3;
        System.out.println("Your dimentional array tda[0][0] is = " + tda[0][0]);
        System.out.println("Your dimentional array tda[0][1] is = " + tda[0][1]);
        System.out.println("Your dimentional array tda[0][2] is = " + tda[0][2]);
        System.out.println("Your dimentional array tda[1][0] is = " + tda[1][0]);
        System.out.println("Your dimentional array tda[1][1] is = " + tda[1][1]);
        System.out.println("Your dimentional array tda[1][2] is = " + tda[1][2]);
        System.out.println("Your dimentional array tda[2][0] is = " + tda[2][0]);
        System.out.println("Your dimentional array tda[2][1] is = " + tda[2][1]);
        System.out.println("Your dimentional array tda[2][2] is = " + tda[2][2]);
    }

}
    
