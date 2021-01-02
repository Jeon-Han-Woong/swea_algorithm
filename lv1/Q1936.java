package algorithm;

import java.util.Scanner;

/* SW Expert Academy LV.1 / Q.1936 - 201230

A와 B가 가위바위보를 하였다.

가위는 1, 바위는 2, 보는 3으로 표현되며 A와 B가 무엇을 냈는지 입력으로 주어진다.

A와 B중에 누가 이겼는지 판별해보자. 단, 비기는 경우는 없다.

 

[입력]

입력으로 A와 B가 무엇을 냈는지 빈 칸을 사이로 주어진다.

3 2

[출력]

A가 이기면 A, B가 이기면 B를 출력한다.

A

*/

public class Q1936 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		switch (a) {
		case 1: 
			if (b == 2) {
				System.out.println("B");
			}
			else if (b == 3) {
				System.out.println("A");
			} break;
		case 2: 
			if (b == 1) {
				System.out.println("A");
			} else if (b == 3) {
				System.out.println("B");
			} break;
		case 3:
			if (b == 1) {
				System.out.println("B");
			} else if (b == 2) {
				System.out.println("A");
			} break;
		}
	}
}
