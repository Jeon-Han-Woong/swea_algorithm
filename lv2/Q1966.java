package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1966 - 210113

Q1966 - 숫자를 정렬하자

주어진 N 길이의 숫자열을 오름차순으로 정렬하여 출력하라.

[제약 사항]

N 은 5 이상 50 이하이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에 N 이 주어지고, 다음 줄에 N 개의 숫자가 주어진다.

10
5
1 4 7 8 0
...

[출력]

출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 0 1 4 7 8
...

*/

public class Q1966 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			
			int N = sc.nextInt();
			
			int [] arrN = new int[N]; // N개의 숫자를 입력받을 배열
			
			for (int j = 0; j < arrN.length; j++) {
				arrN[j] = sc.nextInt();
			}
			for (int j = 0; j < arrN.length; j++) { // 정렬되지 않은 배열 N을 정렬
				for (int k = j; k < arrN.length; k++) {
					if (arrN[j] > arrN[k]) {
						int temp = arrN[j];
						arrN[j] = arrN[k];
						arrN[k] = temp;
					}
				}
			}
			System.out.print("#" + (i + 1) + " "); // 결과 출력
			for (int j = 0; j < arrN.length; j++) {
				System.out.print(arrN[j] + " ");
			}
			System.out.println();
		}
	}
}
