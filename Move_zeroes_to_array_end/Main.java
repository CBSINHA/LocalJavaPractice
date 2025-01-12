package Move_zeroes_to_array_end;

public class Main {
    public static void main(String[] args) {
        moveZeroes Move=new moveZeroes();
        int[] arr={0,1,0,4,12};
        Move.mov(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
