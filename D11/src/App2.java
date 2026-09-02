public class App2 {

	public static void main(String[] args) {
		int[] arr = {10,9,2,3,5,91};
		int n = arr.length;
		int[] dp = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			dp[i] =1;
			for (int j = 1; j < 1; j++) {
				if (arr[j] < arr[i]) {
					dp[i] = Math.max(dp[i],dp[j] + 1);
				}
			}
			max = Math.max(max,  dp[i]);
		}
		System.out.println("LIS Length =" + max);
	}

}   