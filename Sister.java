
package inheritance_ready;


public class Sister extends parents {
    int sister_home;
    double sister_land;
    int sister_car;
    int sister_business;
    double sister_money;
    
    public void sister_properties(){
        sister_home=home-2;
        System.out.println("son_home: "+sister_home);
        sister_land=land*0.34;
        System.out.println("son_land: "+sister_land);
        sister_car=car-2;
        System.out.println("son_car: "+sister_car);
        sister_business=business-2;
        System.out.println("son_business: "+sister_business);
        sister_money=money*0.34;
        System.out.println("son_money: "+sister_money);
    
}
}
