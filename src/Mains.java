package src;
import java.io.*;
import javax.swing.*;

class Mains{
public static void main(String args[]){
    System.out.println("Banking System");
    JFrame frame = new JFrame();
    JButton button = new JButton("hello world");
    


    frame.setSize(1920,800);
    button.setBounds(100,200,220,50);
    frame.add(button);
    frame.setLayout(null);
    frame.setVisible(true);
}
}