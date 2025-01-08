package Second_largest_element_in_array;

public class Second_largest {
    public int find(int[]arr,int n){
        if(n<2){
            throw new IllegalArgumentException("Array must have atleast 2 elements");
        }
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2&&arr[i]<max){
                max2=arr[i];
            }
        }
        return max2;
    }
}
