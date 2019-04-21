
package inheritance_ready;


public class son extends parents {
    int son_home;
    double son_land;
    int son_car;
    int son_business;
    double son_money;
    
    public void son_properties(){
        son_home=home-1;
        System.out.println("son_home: "+son_home);
        son_land=land*0.66;
        System.out.println("son_land: "+son_land);
        son_car=car-1;
        System.out.println("son_car: "+son_car);
        son_business=business-1;
        System.out.println("son_business: "+son_business);
        son_money=money*0.66;
        System.out.println("son_money: "+son_money);
    
}
}
