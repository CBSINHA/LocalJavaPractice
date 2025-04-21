import java.util.Scanner;
public class multilineinput {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Type Q to quit");
    while(true){
        String str=sc.nextLine();
        System.out.println("Written: "+str);
        if(str.equals("Q"))break;
    }
    }
}
