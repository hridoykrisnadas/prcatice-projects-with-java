/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author hridoykrisnadas
 */
 class riverse {
    
    public static void main(String[] args) {
        
        int d, m, y;
        Scanner s = new Scanner(System.in);
        d = s.nextInt();
        m= s.nextInt();
        y=s.nextInt();
        
        LocalDate ld = LocalDate.of(y, m, d);
        System.out.println(ld.getDayOfWeek());
        
    }
    
}
