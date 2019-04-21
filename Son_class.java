package inheritance;

public class Son_class extends Parents_properties {

    // public void son_properties() {
    int son_Home = 2;
    double son_Land = 30;
    int son_Car = 1;
    int son_Business = 2;
    double son_Money = 454000;

    /* int son_home;
    double son_land;
    int son_car;
    int son_business;
    double son_money;*/

    public void Son_properties() {

        son_Home += home - 1;
        son_Land += land * 0.66;
        son_Car += car - 1;
        son_Business += business - 1;
        son_Money += money * 0.66;
        System.out.println("son_home: " + son_Home);
        System.out.println("son_land: " + son_Land);
        System.out.println("son_car: " + son_Car);
        System.out.println("son_business: " + son_Business);
        System.out.println("son_money: " + son_Money);

    }

}
