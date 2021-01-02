package algorithm;

import java.util.Scanner;

/* SW Expert Academy LV.1 / Q.2058 - 201228

하나의 자연수를 입력 받아 각 자릿수의 합을 계산하는 프로그램을 작성하라. 


[제약 사항]

자연수 N은 1부터 9999까지의 자연수이다. (1 ≤ N ≤ 9999)


[입력]

입력으로 자연수 N이 주어진다.

6789

[출력]

각 자릿수의 합을 출력한다.

30

*/

public class Q2058 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n1 = sc.nextInt();
		
		String n2 = Integer.toString(n1);
		
		char[] arr = n2.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + (int) arr[i];
		}
		
		sum = sum - (48 * arr.length); // 아스키코드 '0' = 48
		
		System.out.println(sum);
	}
}
