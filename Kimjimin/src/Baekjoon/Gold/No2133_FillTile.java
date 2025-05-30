package Baekjoon.Gold;

import java.util.Scanner;

public class No2133_FillTile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 2 == 1) {
			System.out.println(0);
			return;
		}
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[2] = 3;
		
		for(int i = 4; i <= n; i+=2) {
			dp[i] = dp[i-2] * 3;
			for(int j = i -4; j>=0; j-=2) {
				dp[i] += dp[j] * 2;
			}
		}
		System.out.println(dp[n]);

	}

}