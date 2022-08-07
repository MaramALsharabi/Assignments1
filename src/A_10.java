import javax.swing.*;
//Modify the program from Exercise 9 so that the dialog continues with the message
// “My name is Hal! What would you like me to do?” Discard the user’s input and display a message such as
// I'm sorry, Dave. I'm afraid I can't do that. Replace Dave with the name that was provided by the user.
public class A_10 {
    public static void main(String[] args)
    {  String name = JOptionPane.showInputDialog(null,"What is your name?");
        String answer =JOptionPane.showInputDialog(null,"My name is Hal! What would you like me to do?");
        JOptionPane.showMessageDialog(null,"I'm sorry, "+name+" I'm afraid I can't do that.");
    }
}
