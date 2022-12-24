package runningSumOf1dArray;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App();
    }

    public int[] runningSum(int[] nums) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            sum += num;
            list.add( sum );
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i]=list.get( i );
        }
        return result;
    }
}
