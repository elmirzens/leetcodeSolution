package reverseStringNumberTwo;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println( app.reverseStr( "abcdefg", 2 ) );
        //bacdefg
        //bacdfeg
    }

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char memory = 0;
        for (int i = 0; i < chars.length; i++) {
            if(i+1 == k) {
                memory = chars[i];
            }
        }
        for (char aChar : chars) {
            if(aChar != memory) {
                sb.append( aChar );
            }
        }
        String result = memory+sb.toString().trim();
        System.out.println(result);

        return "";
    }
}
