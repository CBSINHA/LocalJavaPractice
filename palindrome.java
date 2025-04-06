import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome: ");
        String s=scanner.nextLine();
        System.out.printf("Is '%s' a palindrome?: %b",s,isPalindrome(s));
        scanner.close();
    }
    public static boolean isPalindrome(String s){
<<<<<<< HEAD
                 
=======
        char[] str=s.toCharArray();
        int start=0,end=s.length()-1;
        while (start<end) {
            if(str[start++]!=str[end--]) return false;
        }
        return true;
>>>>>>> 4f85a17a95ca002add80db2c263dd45415afc26e
    }
}