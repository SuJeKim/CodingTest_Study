package Baekjoon.Gold.baekjoon_2225;

import java.io.*;
import java.util.*;

public class baekjoon_2225_2 {
	static int MOD = 1000000000;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		 int dp[][] = new int[N+1][K+1];
	        for(int i=0;i<=N;i++){
	            dp[i][0] = 0;
	            dp[i][1] = 1;
	        }
	        for(int i=0;i<=K;i++){
	            dp[1][i] = i;
	        }
	        for(int i=2;i<=N;i++){
	            for(int j=2;j<=K;j++){
	                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % MOD;
	            }
	        }

	        System.out.println(dp[N][K]);
	    }
	}
