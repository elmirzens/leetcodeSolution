package sumOfAllOddLengthSubarrays;


public class App {

    public static void main(String[] args) {
        App app = new App();
        int[] ar = {1,4,2,5,3};
        System.out.println( app.sumOddLengthSubarrays( ar ) );

    }
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] sum = new int[n];
        int s = 0, ans = 0;
        for(int i = 0; i < n; i++) {
            s += arr[i];
            sum[i] = s;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if((i - j + 1) % 2 == 0) continue;
                ans += sum[i];
                if(j != 0) ans -= sum[j - 1];
            }
        }
        return ans;
    }
}

