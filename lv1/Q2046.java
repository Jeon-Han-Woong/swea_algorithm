package algorithm;

import java.util.Scanner;

/* SW Expert Academy LV.1 / Q.2046 - 201229

주어진 숫자만큼 # 을 출력해보세요.

주어질 숫자는 100,000 이하다.

3 -> ###

 */
public class Q2046 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n <= 100000) {
			for (int i = 0; i < n; i++) {
				System.out.print("#");
			}
		}
	}
}
