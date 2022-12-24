package singleNumber;



public class App {

    public static void main(String[] args) {
        int[] array = {4,1,2,1,2};
        System.out.println( singleNumber( array ) );
    }
    public static int singleNumber(int[] nums) {
        int n=nums[0];
        for(int i=1;i<nums.length;i++)
            n=n^nums[i];
        return n;
    }



}
