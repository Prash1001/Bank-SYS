package src.GUI;

import javax.swing.*;


 class LoginForm {


    //constructor with gui logic
public LoginForm(){
    JPanel LoginPanel = new JPanel();
    JTextField UserID = new JTextField();
    JLabel UserIDlabel = new JLabel("Username");
    JPasswordField UserPassword = new JPasswordField();
    JLabel UserPasswordlabel = new JLabel("Password");
    JButton SubmitButton = new JButton("Submit");
    


    LoginPanel.setSize(1000,800);

    UserIDlabel.setBounds(30,100,220,50);
    UserID.setBounds(100,100,220,50);

    UserPasswordlabel.setBounds(30,150,220,50);
    UserPassword.setBounds(100,150,220,50);

    SubmitButton.setBounds(100,400,220,50);
    
    LoginPanel.add(UserIDlabel);
    LoginPanel.add(UserID);
    LoginPanel.add(UserPasswordlabel);
    LoginPanel.add(UserPassword);
    LoginPanel.add(SubmitButton);
    LoginPanel.setLayout(null);
    LoginPanel.setVisible(true);

}
 }