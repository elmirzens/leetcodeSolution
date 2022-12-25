package sortThePeople;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        App app = new App();
        String[] strings = {"Mary","John","Emma"};
        int[] ints = {180,165,170};
        System.out.println( Arrays.toString( app.sortPeople( strings, ints ) ) );
    }

    public String[] sortPeople(String[] names, int[] heights) {

        Map<Integer,String> stringIntegerMap = new TreeMap<>();



        return null;
    }
}
