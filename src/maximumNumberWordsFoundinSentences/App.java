package maximumNumberWordsFoundinSentences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.mostWordsFound(new String[] {"please wait", "continue to fight", "continue to win"}) );
    }
    public int mostWordsFound(String[] sentences) {
        List<Integer> findCountWords = new ArrayList<>();
        for (String sentence : sentences) {
            String[] strings = sentence.replaceAll( "^[.,\\s]+", "" ).split( "[.,\\s]+" );
            findCountWords.add( strings.length );
        }
        return Collections.max( findCountWords );
    }
}
