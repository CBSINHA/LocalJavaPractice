import java.io.*;
public class prac6 {
    public static void main(String[] args) {
        try{
            File file=new File("text.tst");
            if(file.delete())System.out.println("Deleted");
            else System.out.println("File dont exist");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
