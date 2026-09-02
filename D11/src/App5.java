public class App5 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int[][] dp = new int[rows][cols];
        dp[0][0] = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i > 0)
                    dp[i][j] += dp[i - 1][j];
                if (j > 0)
                    dp[i][j] += dp[i][j - 1];
            }
        }
        System.out.println("Number of ways = "
                + dp[rows - 1][cols - 1]);
    }
}   
 