package thirdMaximumNumber;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        App app = new App();


    }
    public int thirdMax(int[] nums) {
        int first = nums[0];
        for (int i = 1; i < nums.length ; i++)
            if (nums[i] > first){
                first = nums[i];
            }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add( num );
        }
        if(hashSet.size()<=2){
            return first;
        }
        int second = Integer.MIN_VALUE;
        for (int num : nums)
            if(num > second && num < first) {
                second = num;
            }

        int third = Integer.MIN_VALUE;
        for (int num : nums)
            if(num > third && num < second) {
                third = num;
            }
        return third;
    }
}
