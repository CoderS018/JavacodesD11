public class App6 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 3, 1},
            {4, 5, 1},
            {4, 2, 1}
        };
        int[][] dp = new int[3][3];
        dp[0][0] = a[0][0];
        for (int j = 1; j < 3; j++)
            dp[0][j] = dp[0][j - 1] + a[0][j];
        for (int i = 1; i < 3; i++)
           dp[i][0] = dp[i - 1][0] + a[i][0];
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                dp[i][j] = Math.min(
                    dp[i - 1][j],
                    dp[i][j - 1]
                ) + a[i][j];
            }
        }
        System.out.println("Minimum Path Sum = " + dp[2][2]);
    }
}