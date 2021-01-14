package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1961 - 210114

Q1961 - 숫자 배열 회전

N x N 행렬이 주어질 때,

시계 방향으로 90도, 180도, 270도 회전한 모양을 출력하라.


[제약 사항]

N은 3 이상 7 이하이다.

[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에 N이 주어지고,

다음 N 줄에는 N x N 행렬이 주어진다.

10
3
1 2 3
4 5 6
7 8 9
6
6 9 4 7 0 5
8 9 9 2 6 5
6 8 5 4 9 8
2 2 7 7 8 4
7 5 1 9 7 9
8 9 3 9 7 6
…

[출력]

출력의 첫 줄은 '#t'로 시작하고,

다음 N줄에 걸쳐서 90도, 180도, 270도 회전한 모양을 출력한다.

입력과는 달리 출력에서는 회전한 모양 사이에만 공백이 존재함에 유의하라.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1
741 987 369
852 654 258
963 321 147
#2
872686 679398 558496
952899 979157 069877
317594 487722 724799
997427 894586 495713
778960 562998 998259
694855 507496 686278
…

*/

public class Q1961 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			
			int N = sc.nextInt();
			
			String [][] first = new String[N][N]; // N개의 입력을 받을 배열
			String [][] second = new String[N][3]; // 결과값 배열
			
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					first[j][k] = sc.next();
				}
			}
			
			for (int j = 0; j < N; j++) { // 결과값 배열 초기화
				for (int k = 0; k < 3; k++) {
					second[j][k] = "";
				}
			}
			
			for (int j = 0; j < N; j++) { // 결과값 [j][0] 배열 생성
				for (int k = N-1; k >= 0; k--) {
					second[j][0] += first[k][j];
				}
			}
			
			for (int j = N-1; j >= 0; j--) { // 결과값 [j][1] 배열 생성
				for (int k = N-1; k >= 0; k--) {
					second[j][1] += first[j][k];
				}
			}
			
			for (int j = 0; j < N/2; j++) { // 결과값 [j][1] 배열은 역순 생성되므로 배열 역순 정렬
				int max = N-j-1;
				String temp = second[j][1];
				second[j][1] = second[max][1];
				second[max][1] = temp;
			}
			
			for (int j = N-1; j >= 0; j--) { // 결과값 [j][2] 배열 생성
				for (int k = 0; k < N; k++) {
					second[j][2] += first[k][j];
				}
			}
			
			for (int j = 0; j < N/2; j++) { // 결과값 [j][2] 배열은 역순 생성되므로 배열 역순 정렬
				int max = N-j-1;
				String temp = second[j][2];
				second[j][2] = second[max][2];
				second[max][2] = temp;
			}
			
			System.out.println("#" + (i + 1)); // 배열 출력
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(second[j][k] + " "); 
				}
				System.out.println();
			}
		}
	}
}
