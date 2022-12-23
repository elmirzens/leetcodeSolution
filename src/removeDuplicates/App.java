package removeDuplicates;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        System.out.println( removeDuplicates( array ) );
    }
    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add( num );
        }
        return (int) list.stream().distinct().count();
    }
}
