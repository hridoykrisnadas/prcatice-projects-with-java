package method_overloading;

public class Method_Overloading {

    String name;
    String F_name;
    String M_name;
    String Thana;
    String Passion;
    int Roll;
    double C_gpa;

    public void Bio(String name, String F_name, String M_name, String Thana, int Roll, double C_gpa) {
        this.name = name;
        System.out.println("Name:" + name);
        this.F_name = F_name;
        System.out.println("F_Name:" + F_name);
        this.M_name = M_name;
        System.out.println("M_Name:" + M_name);
        this.Thana = Thana;
        System.out.println("Thana:" + Thana);
        this.Roll = Roll;
        System.out.println("Roll:" + Roll);
        this.C_gpa = C_gpa;
        System.out.println("C_GPA:" + C_gpa);
        System.out.println("\n" + "\n");

    }

    public void Bio(String name, String F_name, String M_name, String Thana, String Passion, int Roll, double C_gpa) {
        this.name = name;
        System.out.println("Name:" + name);
        this.F_name = F_name;
        System.out.println("F_Name:" + F_name);
        this.M_name = M_name;
        System.out.println("M_Name:" + M_name);
        this.Thana = Thana;
        System.out.println("Thana:" + Thana);
        this.Passion = Passion;
        System.out.println("Passion:" + Passion);
        this.Roll = Roll;
        System.out.println("Roll:" + Roll);
        this.C_gpa = C_gpa;
        System.out.println("C_GPA:" + C_gpa);

    }

}
