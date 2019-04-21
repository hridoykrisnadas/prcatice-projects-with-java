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
public class FirstDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String Name;
        String address;
        System.out.println("Please Enter Your Name");
        Name = s.nextLine();

        System.out.println("Your Name Is = " + Name);

        System.out.println("Please Enter Your Address ");

        address = s.nextLine();

        System.out.println("Your Adress Is = " + address);
        Double a;
        Double b;

        Double d;
        Double z;
        Double y;

        System.out.println("Please Enter Your First Number");
        a = s.nextDouble();
        System.out.println("Please Enter Your Second Number");
        b = s.nextDouble();
        System.out.println("Please Enter Your Third Number");
        d = s.nextDouble();
        System.out.println("Please Enter Your Fourth Number");
        y = s.nextDouble();
        System.out.println("Please Enter Your Fifth Number");
        z = s.nextDouble();
        Double sum = a + b + d + z + y;
        Double div = a / b / d / y / z;
        Double mult = a * b * d * y * z;

        System.out.println("The Sumation Is = "
                + sum + "\n" + "Div is=" + div + "\n" + "multi is = " + mult);
        System.out.println("Thank You");
        System.out.println("Develop By: Hridoy Krisna Das");
    }

    private static void Int() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
