package minimumIndexSumOfTwoLists;

import java.util.*;

public class App {
    public static void main(String[] args) {
        App app = new App();
        String[] strings = {"happy","sad","good"};
        String[] strings1 = {"sad","happy","good"};
        System.out.println( Arrays.toString( app.findRestaurant( strings, strings1 ) ) );

    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        if(list1.length < list2.length) {
            for (String s : list2) {
                for (String value : list1) {
                    if(Objects.equals( s, value )) {
                        list.add( s );
                    }
                }
            }
        } else {
            for (String s : list1) {
                for (String value : list2) {
                    if(Objects.equals( s, value )) {
                        list.add( s );
                    }
                }
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get( i );
        }
        return result;
    }
}
