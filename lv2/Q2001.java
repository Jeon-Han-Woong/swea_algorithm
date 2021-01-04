package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.2001 - 210104

N x N 배열 안의 숫자는 해당 영역에 존재하는 파리의 개수를 의미한다.

아래는 N=5 의 예이다.
 
	1  3  3  6  7
	8  13 9  12 8
	4  16 11 12 6
	2  4  1  23 2
	9  13 4  7  3

M x M 크기의 파리채를 한 번 내리쳐 최대한 많은 파리를 죽이고자 한다.

죽은 파리의 개수를 구하라!

예를 들어 M=2 일 경우 위 예제의 정답은 49마리가 된다.

	13 9
	16 11	->	최대 모기수 : 49


[제약 사항]

1. N 은 5 이상 15 이하이다.

2. M은 2 이상 N 이하이다.

3. 각 영역의 파리 갯수는 30 이하 이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에 N 과 M 이 주어지고,

다음 N 줄에 걸쳐 N x N 배열이 주어진다.

10
5 2
1 3 3 6 7
8 13 9 12 8
4 16 11 12 6
2 4 1 23 2
9 13 4 7 3
6 3
29 21 26 9 5 8
21 19 8 0 21 19
9 24 2 11 4 24
19 29 1 0 21 19
10 29 6 18 4 3
29 11 15 3 3 29
...

[출력]

출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 49
#2 159
...

*/

public class Q2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int [] result = new int[tc];
		
		for (int i = 0; i < result.length; i++) {
			int n = sc.nextInt();
			int [][] arr = new int [n][n];
			
			int t = sc.nextInt();
			
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					arr[j][k] = sc.nextInt();					
				}
			}
			
			int sum = 0;
			for (int j = 0; j < n-t+1; j++) {
				for (int k = 0; k < n-t+1; k++) {
					int temp = 0;
					for (int l = 0; l < t; l++) {
						for (int m = 0; m < t; m++) {
							temp = arr[l+j][m+k] + temp;
							if (sum < temp) {
								sum = temp;
							}
						}
					}
				}
			}
			result[i] = sum;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println("#" + (i + 1) + " " + result[i]);
		}
	}
}
