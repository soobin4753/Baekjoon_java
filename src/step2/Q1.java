package step2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a > b) { // A가 B보다 큰 경우에는 '>'를 출력한다.
			System.out.println(">");
		}
		else if(a < b) { // A가 B보다 작은 경우에는 '<'를 출력한다.
			System.out.println("<");
		}
		else { // A와 B가 같은 경우에는 '=='를 출력한다.
			System.out.println("==");
		}
	}

}
