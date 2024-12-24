import javax.swing.JOptionPane;
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
            switch(x){

            }
        }
        else{
            option.showMessageDialog(null,"There is a saying:\n\"Curiosity kills tha cat\"\nYou have been that cat and entered a number out of bounds!\nI am profoundly disheartened by your choice\nPick carefully now. Your system integrity might depend on it :P\nDO NOT ATTEMPT TO CLOSE THIS DIALOG BOX OR YOUR SYSTEM32 FOLDER WILL BE DELETED\nTo proceed click OK");

        }
        scanner.close();
    }
}
