package thirdMaximumNumber;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        App app = new App();
        int[] a = {1,1,2};
        System.out.println( app.thirdMax( a ) );

    }
    public int thirdMax(int[] nums) {
        int first = nums[0];
        for (int i = 1; i < nums.length ; i++)
            if (nums[i] > first){
                first = nums[i];
            }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add( nums[i] );
        }
        if(hashSet.size()<=2){
            return first;
        }
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++)
            if (nums[i] > second && nums[i] < first){
                second = nums[i];
            }

        int third = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++)
            if (nums[i] > third && nums[i] < second){
                third = nums[i];
            }
        return third;
    }
}
