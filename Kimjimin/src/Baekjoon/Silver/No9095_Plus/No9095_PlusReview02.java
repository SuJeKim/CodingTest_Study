package Baekjoon.Silver.No9095_Plus;

import java.io.*;
import java.util.*;

public class No9095_PlusReview02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 4; i <= 10; i++) {
			dp[i] = dp[i - 1] + dp[i -2] + dp[i-3];
		}
		
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n]).append("\n");
		}
		System.out.println(sb);
	}

}
