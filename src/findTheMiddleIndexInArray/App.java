package findTheMiddleIndexInArray;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        App app = new App();
        int[] a = {2,5};
        System.out.println( app.findMiddleIndex(a) );

    }
    public int findMiddleIndex(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i< nums.length;i++){
            int x=(i!=0)?nums[i-1]:0;
            int y=nums[nums.length-1]-nums[i];
            if(x==y)return i;
        }
        return -1;
    }
}
