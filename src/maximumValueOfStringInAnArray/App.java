package maximumValueOfStringInAnArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App();
        String[] strings = {"bs9","j"};
        String[] strings1 = {"1","01","001","0001"};
        String[] strings2 = {"alic3","bob","3","4","00000"};
        System.out.println( app.maximumValue( strings ) );
        System.out.println( app.maximumValue( strings1 ) );
        System.out.println( app.maximumValue( strings2 ) );
    }

    public int maximumValue(String[] strs) {
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        for (String str : strs) {
            try {
                integers.add( Integer.parseInt( str ) );
            } catch (NumberFormatException nfe) {
                strings.add( str );
            }
        }
        if(strings.isEmpty()){
            return Collections.max( integers );
        }else {
        int length = strings.get( 0 ).length();
            for (String string : strings) {
                if(string.length() > length) {
                    length = string.length();
                }
            }
            if(integers.size()==0) {
                return length;
            }
            return Math.max( Collections.max( integers ), length );
        }
    }
}

