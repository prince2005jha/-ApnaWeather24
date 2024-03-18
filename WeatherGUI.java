import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WeatherGUI extends JFrame{
  public  WeatherGUI(){
  super("Welcome to ApnaWeather App");
   setDefaultCloseOperation(EXIT_ON_CLOSE);
 setSize(450,650);
   setLocationRelativeTo(null);

   setLayout(null);
setVisible(true);
   setResizable(false);

  }



    public void actionPerformed(ActionEvent ae){

    }
    public static void main(String[] args) {
        System.out.println("hello guys");
        new WeatherGUI();
    }
}
