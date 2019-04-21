/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitoperation;

import java.util.Scanner;

/**
 *
 * @author RIDEY
 */
public class primeno {
    public static void main (String []args ){
        Scanner s = new Scanner (System.in);
       int num = s.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i ==0 && num == 1)
            {
                flag = true;
               System.out.println(num + " is a prime number.");
                break;
            }
             else {
            System.out.println(num + " is a prime number.");
        
        }}
        
            

       

}  }
        
    
