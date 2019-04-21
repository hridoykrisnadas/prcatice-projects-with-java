package practice.progrramming.language.pkg2;

public  class Students {

    Friends f = new Friends();

    int roll;
    String name;
    float mark;
    

    public void getData() {
        System.out.println("Please Enter Your Roll");
        roll = f.input.nextInt();
        System.out.println("Please Enter your Name");
        name = f.input.nextLine();
        System.out.println("Please Enter YOur Mark");
        mark = f.input.nextFloat();
    }

    void Display() {
         getData();
        System.out.println("Roll is: " + roll);
        System.out.println("Name is: " + name);
        System.out.println("Mark is: " + mark);
    }

}
