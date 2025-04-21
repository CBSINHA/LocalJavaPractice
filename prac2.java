import java.time.format.*;
import java.time.*;
public class prac2 {
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("hh:mm:ss.S a  MM/yyyy");
        String formatted=now.format(format);
        System.out.println(formatted);
        String str="12/Aug/2008  12:50 pm";
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd/MMM/yyyy  hh:mm a");
        LocalDateTime today=LocalDateTime.parse(str,format2);
        System.out.println("Parsed DateTime: "+today);
    }
}
