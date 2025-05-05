import java.io.*;
import java.util.*;
public class prac4 {
    public static void main(String[]ar){
        try{
        File file=new File("text.tst");
        if(file.createNewFile()){
            System.out.println("File created");
        }else System.out.println("File already exists, give another name for new file");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}
