package problem;

import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        int smallest = 0;
        int large;
        int num;

        System.out.println("enter the number");

        Scanner input = new Scanner(System.in);

        large = input.nextInt();
        num = input.nextInt();

        if (num > large) {
            System.out.println("the largest is:" + num);
        } else {
            System.out.println("the largest is:" + large);
        }
    }
}
