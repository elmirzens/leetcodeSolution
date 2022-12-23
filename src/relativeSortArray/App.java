package relativeSortArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        for (int a : arr1) {
            list.add( a );
        }
        List<Integer> list1 = new ArrayList<>();
        for (int a : arr2) {
            list1.add( a );
        }
        List<Integer> f = new ArrayList<>();
        f.addAll( list );
        f.addAll( list1 );

        int[] ar = new int[f.size()];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = f.get( i );
        }
        Arrays.sort( ar );
        return ar;
    }
}
