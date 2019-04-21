package lowecase.to.uppercase;

import java.util.Scanner;

 class LoweCaseToUpperCase {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Text, Result;
        System.out.println("Please Input your lowercase No: \n");
        Text = s.nextLine();
        Result = Text.toUpperCase();
        System.out.println(Result);
       

    }

}
