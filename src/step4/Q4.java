package step4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
	// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < 9; i++) {
			int input = sc.nextInt();
			num[i] = input;
		}
		// num 배열에 들어있는 값이 max(0)보다 클 경우 max에 값을, index에 해당하는 i+1 값을 넣으며 배열이 끝날때까지 반복 합니다. 
		// index의 값에 i+1을 넣는 이유는, 문제에서 max값의 인덱스 번호가 아니라 몇번째(1~9) 수인지 구하라고 하기때문에 인덱스 번호보다 1을 더 주어야 합니다.
		for(int i = 0; i < 9; i++) {
			if(num[i]>max) {
				max = num[i];
				index = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
