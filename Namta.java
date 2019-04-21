package first.day;

import java.util.Scanner;

public class Namta {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter First Nmber");
        int i;
        i = s.nextInt();
        System.out.println("Please Enter How need Nomenclature");
        int n;
        n = s.nextInt();
        System.out.println("Please Enter Limit");
        int a;
        a = s.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + n * i);

        }

    }
}
