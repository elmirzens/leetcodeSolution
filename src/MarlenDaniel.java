import java.util.ArrayList;
import java.util.List;

public class MarlenDaniel {

    public static void main(String[] args) {
        String str = "4363rdfgdhgrty'[;.9oπ.p34l5[p";
        System.out.println( str( str ) );

    }
    public static String str(String str){
        List<Character> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = str.toLowerCase().toCharArray();
        for (char i = 'a'; i <= 'z'; i++){list.add( i );}
        for (char ch:chars){for (char cha:list){
            if(ch==cha){stringBuilder.append( ch );}}
        }
        return String.valueOf( stringBuilder );
    }
}

