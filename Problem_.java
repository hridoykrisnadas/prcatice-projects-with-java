package problem;

import java.util.Scanner;

public class Problem_ {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        largnum();
        positive();

    }

    public static void largnum() {
        System.out.println("Please Enter First Number");
        int a;
        a = s.nextInt();
        System.out.println("Please Enter Second Number");
        int b;
        b = s.nextInt();
        if (a < b) {
            System.out.println(b + " is The large Number ");

        } else {
            System.out.println(a + " is The large Number ");
        }

    }

    public static void positive() {
        System.out.println("Please Enter Your Number");
        int a;
        a = s.nextInt();
        if (a < 0) {
            System.out.println("This number is Negative");

        } else if (a == 0) {
            System.out.println("This Number is equal");
        } else {
            System.out.println("This Number is Positive");
        }
    }

}
