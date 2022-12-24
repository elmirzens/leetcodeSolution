package lengthOfLastWord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App();
        String s = "luffy is still joyboy";
        System.out.println( app.lengthOfLastWord( s ) );
    }
    public int lengthOfLastWord(String s) {
        String[] arrOfStr = s.split(" ");
        List<String> stringList = new ArrayList<>();
        Collections.addAll( stringList, arrOfStr );
        String s1 = stringList.get( stringList.size()-1 );
        return s1.length();
    }
}
