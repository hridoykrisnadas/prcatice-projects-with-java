

package interface_1;


public class Child implements G_F__Properties, Parents_properties {

    @Override
    public void gf_properties() {
        System.out.println("Grand Father Properties");
        System.out.println("Home: " + home);
        System.out.println("Cow: " + home);
        System.out.println("Land: " + home);

    }

    @Override
    public void parents_properties() {
        System.out.println("Parents Properties");
        System.out.println("Home: " + Home);
        System.out.println("Land: " + Land);
        System.out.println("Car: " + Car);
        System.out.println("Business: " + Business);
        System.out.println("Money: " + Money);

    }

}
