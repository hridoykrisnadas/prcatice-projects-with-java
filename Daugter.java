package inheritance;

public class Daugter extends Parents_properties {

    int daughter_home;
    double daughter_land;
    int daughter_car;
    int daughter_business;
    double daughter_money;

    public void Daugter_properties() {

        daughter_home = home - 2;
        daughter_land = land * 0.34;
        daughter_car = car - 2;
        daughter_business = business - 2;
        daughter_money = money * 0.34;
        System.out.println("daughter_home: " + daughter_home);
        System.out.println("daughter_land: " + daughter_land);
        System.out.println("daughter_car: " + daughter_car);
        System.out.println("daughter_business: " + daughter_business);
        System.out.println("daughter_money: " + daughter_money);

    }
}
