import java.io.*;
public class prac5 {
    public static void main(String[] args) {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Hey this is from BufferedWriter");
            writer.newLine();
            writer.write("This is the 2nd line");
            writer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
