package Baekjoon.Silver.No15651;

import java.io.*;
import java.util.*;

public class No15651 {

	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		
		dfs(0);
		System.out.println(sb);
	}

	private static void dfs(int depth) {
		if(depth == m) {
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i = 0; i < n; i++) {
			arr[depth] = i + 1;
			dfs(depth + 1);
		}
	}

}