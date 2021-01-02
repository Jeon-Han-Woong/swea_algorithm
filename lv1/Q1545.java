package algorithm;

import java.util.Scanner;

/* SW Expert Academy LV.1 / Q.1545 - 201230

주어진 숫자부터 0까지 순서대로 찍어보세요
 
아래는 입력된 숫자가 N일 때 거꾸로 출력하는 예시입니다

[입력]

8

[출력]

8 7 6 5 4 3 2 1 0

*/


public class Q1545 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = n; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}

}
