package step4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		int b = 0;
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		int c = sc.nextInt();
		
		for(int j = 0; j < a; j++) {
			if(arr[j] == c) {
				b++;
			}
		}
		System.out.println(b);
		
	}

}
