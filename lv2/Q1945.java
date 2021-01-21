package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1945 - 210121

Q1945 - 간단한 소인수분해

숫자 N은 아래와 같다.

N=2a x 3b x 5c x 7d x 11e

N이 주어질 때 a, b, c, d, e 를 출력하라.


[제약 사항]

N은 2 이상 10,000,000 이하이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에 N 이 주어진다.

10  
6791400
1646400
1425600
8575
185625
6480
1185408
6561
25
330750

[출력]

출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 3 2 2 3 1
#2 6 1 2 3 0
#3 6 4 2 0 1
#4 0 0 2 3 0
#5 0 3 4 0 1
#6 4 4 1 0 0
#7 7 3 0 3 0
#8 0 8 0 0 0
#9 0 0 2 0 0
#10 1 3 3 2 0

*/

public class Q1945 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			
			int N = sc.nextInt();
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			
			while(N % 2 == 0) { // 2를 소인수 분해
				N /= 2;
				a++;
			}
			while(N % 3 == 0) { // 3을 소인수 분해
				N /= 3;
				b++;
			}
			while(N % 5 == 0) { // 5를 소인수 분해
				N /= 5;
				c++;
			}
			while(N % 7 == 0) { // 7을 소인수 분해
				N /= 7;
				d++;
			}
			while(N % 11 == 0) { // 11을 소인수 분해
				N /= 11;
				e++;
			}
			
			System.out.println("#" + (i + 1) + " " + a + " " + b + " " + c + " " + d + " " + e);
		}
	}
}
