import java.io.*;
public class prac3 {
    public static void main(String[] args) {
        try(BufferedReader in=new BufferedReader(new FileReader("test.txt"));){
            String str;
            while((str=in.readLine())!=null){
                System.out.println(str);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
