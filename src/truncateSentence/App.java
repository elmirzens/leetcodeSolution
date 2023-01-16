package truncateSentence;

public class App {

    public static void main(String[] args) {
        App a = new App();
        System.out.println( a.truncateSentence( "Hello how are you Contestant", 4 ) );
        System.out.println( a.truncateSentence( "What is the solution to this problem", 4 ) );
        System.out.println( a.truncateSentence( "chopper is not a tanuki", 5 ) );
    }

    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] strings = s.replaceAll("^[.,\\s]+", "").split("[.,\\s]+");
        int count = 0;
        for (String anyWord:strings) {
            if(count!=k){
                sb.append(anyWord).append( " " );
            }else {
                break;
            }
            count++;
        }
        return sb.toString().trim();
    }
}
