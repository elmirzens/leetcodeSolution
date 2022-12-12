package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        int[] array = {3,2,4};
        int target = 6;

        System.out.println( Arrays.toString( twoSum( array, 6 ) ) );

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put( nums[i],i );
        }
        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];
            if(map.containsKey( requiredNumber ) && map.get( requiredNumber )!=i){
                return new int[]{i,map.get( requiredNumber )};
            }
        }

        throw new IllegalArgumentException("siuuuu");

    }
}
