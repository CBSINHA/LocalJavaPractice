package Move_zeroes_to_array_end;

public class moveZeroes {

    public int[] mov(int[]arr){
        int j=0;

        for(int i=0;i<arr.length;i++){

            if(arr[j]==0&&arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

            if(arr[j]!=0) j++;
        }

        return arr;
    }
}
