package Baekjoon.Sliver.baekjoon_1309;

import java.io.*;

public class baekjoon_1309_2 {
	
	static final int mod = 9901;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(solution(N));
		
	}
	
	public static int solution(int n) {
		int[][] dp = new int[n + 1][3];

		dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % mod;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % mod;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % mod;
        }

        int answer = (dp[n][0] + dp[n][1] + dp[n][2]) % mod;
		return answer;
	}
}

