
package inheritance_practice;

class Students{
    int Roll;
    String Name = new String();
    
    }
    class Result extends Students {
     
        float Mark;
        void GetData(){
            Roll= 941084;
            Name="Hridoy Krisna Das";
            Mark= 70.5f;
        }
        
        void Display(){
            
                System.out.println("Roll is: "+Roll );
                System.out.println("Name is: "+Name);
                System.out.println("Mark is: "+Mark);
    }
        
       
    }


 class Inheritance_Practice {
    
    

   
    public static void main(String[] args) {
        
        Result R;
        R = new Result();
        R.GetData();
        R.Display();


    }
    
}
