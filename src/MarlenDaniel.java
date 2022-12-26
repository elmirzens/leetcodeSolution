import java.util.*;

public class MarlenDaniel {

    public static void main(String[] args) {
        int[] a = {3,6,8,9,12,45,4};
        System.out.println( str( a ) );

    }

    public static int str(int[] nums) {
        Set<Integer> hashSet = new TreeSet<>();
        for (int j : nums) {
            hashSet.add( j );
        }
        List<Integer> list = new ArrayList<>( hashSet );
        int max = list.get(0);
        if(list.size()==2){
            for (int i = 1; i < list.size(); i++)
                if (list.get( i ) > max)
                    max = list.get( i );
            return max;
        } else if(list.size()==1) {
            return list.get( 0 );
        }
        System.out.println( list );

        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 3) {
                return list.get( i );
            }
        }
        return 0;
    }
}

