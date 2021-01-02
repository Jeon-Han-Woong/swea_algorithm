package algorithm;

import java.util.Scanner;

/* SW Expert Academy LV.1 / Q.2019 - 201230

1부터 주어진 횟수까지 2를 곱한 값(들)을 출력하시오.

주어질 숫자는 30을 넘지 않는다.


[입력]

8

[출력]

1 2 4 8 16 32 64 128 256

*/

public class Q2019 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n <= 30) {
			int multi = 1;
			
			for (int i = 1; i <= n; i++) {
				if (i == 1) {
					System.out.print(multi + " ");
				}
				multi *= 2;
				System.out.print(multi + " ");
			} 
		} else System.exit(0);
	}
}
