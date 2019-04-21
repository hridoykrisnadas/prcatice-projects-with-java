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
class Porimity {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        Double a;
        Double b;
        Double c;
        System.out.println("Please Enter value of a");
        a = p.nextDouble();
        System.out.println("Please Enter value of b");
        b = p.nextDouble();
        System.out.println("Please enter value of c");
        c = p.nextDouble();
        Double khetrofol;
        khetrofol = 2 * a * b + b * c + c * a;
        System.out.println("Your Khetrofol is = " + khetrofol);
        Double Aiyoton;
        Aiyoton = a * b * c;
        System.out.println("Your Aiyoton is = " + Aiyoton);

        Double d;
        Double e;
        Double f;
        System.out.println("Please enter value of d");
        d = p.nextDouble();
        System.out.println("Please enter your value of e");
        e = p.nextDouble();
        System.out.println("Please enter value of f");
        f = p.nextDouble();
        Double ghanakkhetro;
        ghanakkhetro = 6 * d * d;
        System.out.println("Your ghanakkhetro is= " + ghanakkhetro);
        Double x;
        Double y;
        Double z;
        System.out.println("Enter your value of x");
        x = p.nextDouble();
        System.out.println("Enter your value of y");
        y = p.nextDouble();
        Double ativujsqrez;
        ativujsqrez = x * x + y * y;
        System.out.println("your ativujsqre is = " + ativujsqrez);
        System.out.println("Thank You" + "\n" + "Develop by Hridoy Krisna Das");

    }

}
