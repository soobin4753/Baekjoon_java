package step3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
	// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오. n (1 ≤ n ≤ 10,000)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
