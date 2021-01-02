package algorithm;

import java.util.Scanner;

/* SW Expert Academy LV.1 / Q.2029 - 201230

2개의 수 a, b를 입력 받아, a를 b로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.

[제약 사항]

각 수는 1이상 10000이하의 정수이다.

3   
9 2  
15 6 
369 15        

[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 2개의 수가 주어진다.

#1 4 1
#2 2 3
#3 24 9

[출력]

출력의 각 줄은 '#t'로 시작하고 공백을 한 칸 둔 다음, 몫을 출력하고 공백을 한 칸 둔 다음 나머지를 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 4 1
#2 2 3
#3 24 9

*/

public class Q2029 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n >= 1 && n <= 10000) {
			int [] arr = new int[n];
			int [] result = new int[n];
			int [] remain = new int[n];
			
			for (int i = 0; i < arr.length; i++) {
				int first = sc.nextInt();
				int second = sc.nextInt();
				result[i] = first / second;
				remain[i] = first % second;
			}
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println("#" + (i + 1) + " " + result[i] + " " + remain[i]);
			}
		} else System.exit(0);
	}
}
