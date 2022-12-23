package findMedianSortedArrays;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        int[] num1 = {1,3};
        int[] num2 = {2,7};
        System.out.println( findMedianSortedArrays( num1, num2 ) );

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> num1 = new ArrayList<>();
        for (int j : nums1) {
            num1.add( j );
        }
        List<Integer> num2 = new ArrayList<>();
        for (int j : nums2) {
            num2.add( j );
        }
        List<Integer> sum = new ArrayList<>();
        sum.addAll( num1 );
        sum.addAll( num2 );
        int sums = 0;
        for (int a : sum) {
            sums += a;
        }
        return (double) sums / sum.size();

    }
}