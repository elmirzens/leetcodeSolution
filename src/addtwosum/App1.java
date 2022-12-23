package addtwosum;


public class App1 {
    public static void main(String[] args) {
        int[] l1 = {2,4,3};
        int[] l2 = {5,6,4};
        int l1Int = 0;
        int l2Int = 0;
        StringBuilder l1stringBuilder = new StringBuilder( "" );
        StringBuilder l2stringBuilder = new StringBuilder( "" );
        for (int i = l1.length - 1; i >= 0; i--) {
            l1stringBuilder.append( l1[i] );
        }
        for (int i = l2.length - 1; i >= 0; i--) {
            l2stringBuilder.append( l2[i] );
        }
        l1Int = Integer.parseInt( String.valueOf( l1stringBuilder ) );
        l2Int = Integer.parseInt( String.valueOf( l2stringBuilder ) );
        int sum = l1Int+l2Int;
        String sumAll = String.valueOf( sum );
        char[] chars = sumAll.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]+" ");
        }
        for (int i = 0; i < l1.length; i++) {
            
        }
    }
}
