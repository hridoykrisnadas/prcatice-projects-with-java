
package my.first.gui;
import java.awt.*;



public class MYFirstGUI extends Frame{
    Label theLabel = new Label("Hridoy Krisna Das" ,Label.CENTER );

public static void main(String []args){
    MYFirstGUI theApp = new MYFirstGUI();

}

public MYFirstGUI(){
    super ("Hridoy Krisna Das");
    add (theLabel);
    setSize (1000,1000);
    
    setVisible(true);

}
    }



    

