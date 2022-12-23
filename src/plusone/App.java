package plusone;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        int[] array = {9,8,7,6,5,4,3,2,1,0};
        System.out.println( Arrays.toString( plusOne( array ) ) );
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder l1stringBuilder = new StringBuilder();
        for (int digit : digits) {l1stringBuilder.append( digit );}
        long l1Int = Long.parseLong( String.valueOf( l1stringBuilder ) );
        String convert = String.valueOf( l1Int+1 );
        char[] chars = convert.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (char aChar : chars) {list.add( Integer.valueOf( String.valueOf( aChar ) ) );}
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {array[i]=list.get( i );}
        return array;
    }

}