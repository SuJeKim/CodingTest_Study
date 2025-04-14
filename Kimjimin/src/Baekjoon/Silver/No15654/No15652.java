package Baekjoon.Silver.No15654;

import java.io.*;
import java.util.*;

public class No15652 {

	static int n, m;
	static int[] arr, result;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		result = new int[m];
		visit = new boolean[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		dfs(0);
		System.out.println(sb);
		
	}

	private static void dfs(int depth) {
		if(depth == m) {
			for(int val : result) {
				sb.append(val).append(" ");
			}
			sb.append('\n');
			return;
		}
		for(int i = 0; i < n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				result[depth] = arr[i];
				dfs(depth + 1);
				visit[i] = false;
			}
		}
		
	}

}
