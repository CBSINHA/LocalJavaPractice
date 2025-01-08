package Second_largest_element_in_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements you want to be in an array(Must be positive): ");
        n=scanner.nextInt();
        int[]arr=new int[n];
        System.out.print("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Second_largest sl=new Second_largest();
        System.out.println("The second largest element in the array is: "+sl.find(arr,n));
        scanner.close();
}
}
