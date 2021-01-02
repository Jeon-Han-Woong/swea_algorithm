package algorithm;

import java.util.Scanner;

/* SW Expert Academy LV.1 / Q.1933 - 201230
 
입력으로 1개의 정수 N 이 주어진다.

정수 N 의 약수를 오름차순으로 출력하는 프로그램을 작성하라.
 

[제약사항]

N은 1이상 1,000이하의 정수이다. (1 ≤ N ≤ 1,000)
 

[입력]

입력으로 정수 N 이 주어진다.

10

[출력]

정수 N 의 모든 약수를 오름차순으로 출력한다.

1 2 5 10

*/

public class Q1933 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n >= 1 && n <= 1000) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
