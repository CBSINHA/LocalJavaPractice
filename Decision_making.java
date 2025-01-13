import javax.swing.JOptionPane;//for GUI
import java.util.Random;
import java.util.Scanner;
public class Decision_making {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        JOptionPane option=new JOptionPane();
        Random random=new Random();
        int value=random.nextInt(10);
        System.out.println("Enter a random integer between 0 to 9(both inclusive)");
        int x=scanner.nextInt();
        System.out.println("Random Integer: "+value);
        System.out.println("Your Integer: "+x);
        if(x==value){
            option.showMessageDialog(null,"Congratulations on Destroying System Boot files!");
            option.showMessageDialog(null,"Backing up System files before next boot is recomended:)");
        }
        else if(x>=0&&x<=9){
            System.out.println("     :(      \nYour numbers didn't match\nTry running the pṇrogram again to find out what it actually does ;)\nOr maybe try entering numbers out of bounds who knows what lady luck has for you :)");
        }
        else{
            option.showMessageDialog(null,"There is a saying:\n\"Curiosity kills tha cat\"\nYou have been that cat and entered a number out of bounds!\nI am profoundly disheartened by your choice\nPick carefully now. Your system integrity depends on your luck :P\nDO NOT ATTEMPT TO CLOSE THIS DIALOG BOX OR YOUR SYSTEM32 FOLDER WILL BE DELETED\nTo proceed click 'OK'");
            int choice=Integer.parseInt(option.showInputDialog("Enter either 0 or 1"));
            if(choice>1||choice<0){
                option.showMessageDialog(null,"YOU STUPID!");
                option.showMessageDialog(null,"Deleting Essential Boot Files..........\nSystem backup before next boot recomended!");

            }
            else if(random.nextInt(2)==choice){
                option.showMessageDialog(null,"System backup before next boot recomended!");
                option.showMessageDialog(null,"Essential boot files deleted");
                option.showMessageDialog(null,"NEVER PUSH YOUR LUCK TOO FAR\n                       XD");
            }
            else{
                option.showMessageDialog(null,"CONGRATULATIONS!\nYou are free to exit now\n              OR              \nYou can run the code again to find out what it actually does ;)");
            }
        }
        scanner.close();
    }
}