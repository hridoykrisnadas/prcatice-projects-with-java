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
public class powerroot {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("For (a+b)^3");

        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        int aplusbq;
        aplusbq = a * a * a + 3 * a * a * b + 3 * a * b * b + b * b * b;
        System.out.println("(a+b)^3 =" + aplusbq);
        int aplusbholeq;
        aplusbholeq = (int) Math.pow(a, 3) + 3 * (int) Math.pow(a, 2) * b + 3 * a * (int) Math.pow(b, 2) + (int) Math.pow(b, 3);
        System.out.println("(a+b)^3= " + aplusbholeq);
        int Aplusbq;
        Aplusbq = (int) Math.pow((a + b), 3);
        System.out.println("(a+b)^3= " + Aplusbq);
        int anusidh;
        anusidh = (int) Math.pow(a, 3) + (int) Math.pow(b, 3) + 3 * a * b * (a + b);
        System.out.println("Yor Anusidhanto is= " + anusidh);

        System.out.println("For (a-b)^3");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        int aminusb;
        aminusb = a * a * a - 3 * a * a * b + 3 * a * b * b - b * b * b;
        System.out.println("The aminusb is= " + aminusb);
        int Aminusb = (int) Math.pow(a, 3) - 3 * (int) Math.pow(a, 2) * b + 3 * a * (int) Math.pow(b, 2) - (int) Math.pow(b, 3);
        System.out.println("The Aminusb is= " + Aminusb);
        int aminusbq = (int) Math.pow((a - b), 3);
        System.out.println("The aminusbq is= " + aminusbq);
        int anusidhminus = (int) Math.pow(a, 3) - (int) Math.pow(b, 3) - 3 * a * b * (a - b);

        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        int aqplusbq = (int) Math.pow((a + b), 1) * ((int) Math.pow(a, 2) - a * b + (int) Math.pow(b, 2));
        System.out.println("a^3+b^3= " + aqplusbq);
        int Aqplusbq = (int) Math.pow((a + b), 3) - 3 * a * b * ((int) Math.pow((a + b), 1));
        System.out.println("a^3+b^3= " + Aqplusbq);

        System.out.println("For a^3-b^3");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        int aqminusBq = (int) Math.pow((a - b), 1) * ((int) Math.pow(a, 2) + a * b + (int) Math.pow(b, 2));
        System.out.println("a^3-b^3= " + aqminusBq);
        int AqminusBq = (int) Math.pow((a - b), 3) + 3 * a * b * (int) Math.pow((a - b), 1);
        System.out.println("a^3-b^3= " + AqminusBq);

        System.out.println("For (a+b)^2");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        int holesqr;
        holesqr = a * a + 2 * a * b + b * b;
        System.out.println("a+b)^2= " + holesqr);
        int holesqre = (int) Math.pow(a, 2) + 2 * a * b + (int) Math.pow(b, 2);
        System.out.println("a+b)^2= " + holesqre);
        int Holesqr = (int) Math.pow((a + b), 2);
        System.out.println("a+b)^2= " + Holesqr);
        int anusidhantis = (int) Math.pow((a - b), 2) + 4 * a * b;
        System.out.println("a+b)^2= " + anusidhantis);

        System.out.println("For (a-b)^2 ");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        int minusqr = a * a - 2 * a * b + b * b;
        System.out.println("(a-b)^2= " + minusqr);
        int minusqre = (int) Math.pow(a, 2) - 2 * a * b + (int) Math.pow(b, 2);
        System.out.println("(a-b)^2= " + minusqre);
        int Minusqre = (int) Math.pow((a - b), 2);
        System.out.println("(a-b)^2= " + Minusqre);
        int anusidhantais = (int) Math.pow((a + b), 2) - 4 * a * b;
        System.out.println("(a-b)^2= " + anusidhantais);

        System.out.println("For a^2+b^2");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        int asqplusbsq = (int) Math.pow((a + b), 2) - 2 * a * b;
        System.out.println("a^2+b^2= " + asqplusbsq);
        int Asqplusbsq = (int) Math.pow((a - b), 2) + 2 * a * b;
        System.out.println("a^2+b^2= " + Asqplusbsq);

        System.out.println("For a^2-b^2");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        int asqminusbsq = (int) Math.pow((a + b), 1) - (int) Math.pow((a - b), 1);
        System.out.println("a^2-b^2= " + asqminusbsq);
        int asqrminusbsqr = (a + b) - (a - b);
        System.out.println("a^2-b^2= " + asqrminusbsqr);

        System.out.println("For 4ab");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        int fourab = (int) Math.pow((a + b), 2) - (int) Math.pow((a - b), 2);
        System.out.println("4ab= " + fourab);
        int Fourab = (a + b) * (a + b) - (a - b);
        System.out.println("4ab+ " + Fourab);

        System.out.println("For ab");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        int ab = (int) Math.pow(((a + b) / 2), 2) - (int) Math.pow(((a - b) / 2), 2);
        System.out.println("ab= " + ab);
        int AB = ((a + b) / 2) * ((a + b) / 2) - ((a - b) / 2) * ((a - b) / 2);
        System.out.println("ab= " + AB);

        System.out.println("For (a+b+c)^2");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        System.out.println("Please input value of c");
        c = s.nextInt();

        int abc = (int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2) + 2 * a * b + 2 * a * c + 2 * c * b;
        System.out.println("(a+b+c)^2= " + abc);
        int Abc = a * a + b * b + c * c + 2 * a * b + 2 * b * c + 2 * c * a;
        System.out.println("(a+b+c)^2= " + Abc);

        System.out.println("For a^2+b^2+c^2");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        System.out.println("Please input value of c");
        c = s.nextInt();

        int asqbsqcsq = (int) Math.pow((a + b + c), 2) - 2 * (int) Math.pow((a * b) + (b * c) + (c * a), 1);
        System.out.println("a^2+b^2+c^2= " + asqbsqcsq);
        int Asqbsqcsq = (a + b + c) * (a + b + c) - 2 * (a * b + b * c + c * a);
        System.out.println("a^2+b^2+c^2= " + Asqbsqcsq);

        System.out.println("For ab+bc+ca");
        System.out.println("Please Input  value of a");
        a = s.nextInt();

        System.out.println("Please input value of b");
        b = s.nextInt();

        System.out.println("Please input value of c");
        c = s.nextInt();

        int abbcca = (int) Math.pow((a + b + c), 2) - a * a + b * b + c * c;
        System.out.println("2(ab+bc+ca)= " + abbcca);
        int Abbcca = (a + b + c) * (a + b + c) - (a * a + b * b + c * c);
        System.out.println("2(ab+bc+ca)");

        System.out.println("Thank You" + "\n" + "Develop By: Hridoy Krisna Das");

    }
}
