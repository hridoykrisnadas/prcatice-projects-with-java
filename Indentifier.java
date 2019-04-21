/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indentifier;

/**
 *
 * @author hridoykrisnadas
 */
public class Indentifier {

    static int $MySerial = 20;
    static float My_Salary = 499.54f;

    public static double giveSalary() {
        return My_Salary * 100;

    }

    public static void main(String[] args) {
        System.out.println($MySerial);
        System.out.println(giveSalary());

    }

}
