public class App4 {
    public static void main(String[] args) {
        String s = "ABCD";
        int n = s.length();
        int[] dp = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) < s.charAt(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println("LIS Length = " + max);
    }
}   