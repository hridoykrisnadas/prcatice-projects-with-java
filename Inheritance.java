package inheritance;

//import java.util.Scanner;
public class Inheritance {

    public static void main(String[] args) {
        Parents_properties p = new Parents_properties();

        /*
        Scanner s = new Scanner(System.in);
       
        System.out.println("Home Properties is: ");
        int home = s.nextInt();
        System.out.println("Land Properties is: ");
        int land = s.nextInt();
        System.out.println("Car are: ");
        int car = s.nextInt();
        System.out.println("Business Properties is: ");
        int business = s.nextInt();
        System.out.println("Money is: ");
        int money = s.nextInt();*/
        //   p.parents_p(3, 100, 3, 5, 1000);
        Son_class S = new Son_class();

        S.Son_properties();
       S.Son_properties();


        Daugter d = new Daugter();
        d.Daugter_properties();

    }

}
