import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] arg) {
        JOptionPane.showMessageDialog(null,"Welcome to simple java GUI");
        String name=JOptionPane.showInputDialog("What's your name?");
        JOptionPane.showMessageDialog(null, "Your name is "+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
    }
}