package step1;

import java.util.Scanner;

public class Q9 {
	// 동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
	// 체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가
	// 올바르지 않았다.
	// 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
	// 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력값
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		// 체스 피스 수
		int king = 1;
		int queen = 1;
		int look = 2;
		int bishop = 2;
		int night = 2;
		int phone = 8;

		System.out.print(king - a + " ");
		System.out.print(queen - b + " ");
		System.out.print(look - c + " ");
		System.out.print(bishop - d + " ");
		System.out.print(night - e + " ");
		System.out.print(phone - f);
	}
}
