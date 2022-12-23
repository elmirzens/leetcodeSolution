package longestCommonPrefix;

public class App {
    public static void main(String[] args) {

        String[] str = {"camg", "camcecar", "camr"};
        System.out.println( longestCommonPrefix( str ) );
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        if(strs == null || strs.length == 0) {
            return prefix.toString();
        }
        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min( minimumLength, strs[i].length() );
        }
        for (int i = 0; i < minimumLength; i++) {
            char count = strs[0].charAt( i );
            for (String string : strs) {
                if(string.charAt( i ) != count) {
                    return prefix.toString();
                }
            }
            prefix.append( count );
        }
        return prefix.toString();
    }
}
