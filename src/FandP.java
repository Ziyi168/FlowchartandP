/**
 * Created by Ziyi on 3/15/2017.
 */

import javax.swing.JOptionPane;

public class FandP{
    public static void main(String[]args){
        String name; String pw;

        name = JOptionPane.showInputDialog("Enter your username:");
        pw = JOptionPane.showInputDialog("Enter your password:");

        if ((name.equals("ziyi"))&&(pw.equals("123"))){
            JOptionPane.showMessageDialog(null, "Welcome "+ name);
        }else
            JOptionPane.showMessageDialog(null, "Invalid username or password, try agian");
    }

}






