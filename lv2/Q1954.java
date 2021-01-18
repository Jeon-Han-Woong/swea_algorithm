package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1954 - 210118

Q1954 - 달팽이 숫자

달팽이는 1부터 N*N까지의 숫자가 시계방향으로 이루어져 있다.

다음과 같이 정수 N을 입력 받아 N크기의 달팽이를 출력하시오.


[예제]

N이 3일 경우,
 
 1 2 3
 8 9 4
 7 6 5


N이 4일 경우,
 
 1  2  3  4
 12 13 14 5
 11 16 15 6
 10 9  8  7

[제약사항]

달팽이의 크기 N은 1 이상 10 이하의 정수이다. (1 ≤ N ≤ 10)


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스에는 N이 주어진다.

2    
3   
4         

[출력]

각 줄은 '#t'로 시작하고, 다음 줄부터 빈칸을 사이에 두고 달팽이 숫자를 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1
1 2 3
8 9 4
7 6 5
#2
1 2 3 4
12 13 14 5
11 16 15 6
10 9 8 7

*/

public class Q1954 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			
			int N = sc.nextInt();
			
			int [][] result = new int [N][N];
			
			int temp = 0; // 해당 배열에 들어갈 수
			int cnt = 0; // 배열 개수를 세는 변수
			int a = 0; // 달팽이 모양으로 돌리기 위한 조건
			int b = N-1; // 달팽이 모양으로 돌리기 위한 조건
			int escape = 0;
			if(N % 2 == 0) { // N이 짝수일 경우.
				while (true) { 
					for (int j = a; j < b; j++) { // → 값 대입
						temp = temp + 1;
						result [a][j] = temp;
						cnt += 1; // 배열 개수를 세는 변수
						if(cnt == (N*N)) { // 배열이 꽉 찼을 경우 해당 반복문 탈출
							escape = -1; // escape 값을 -1로 변경
							break;
						}
					} if (escape == -1) break; // 반복문 탈출
					for (int j = a; j < b; j++) { // ↓ 값 대입
						temp = temp + 1;
						result [j][b] = temp;
						cnt += 1;
						if(cnt == (N*N)) {
							escape = -1;
							break;
						}
					} if (escape == -1) break;
					for (int j = b; j > a; j--) { // ← 값 대입
						temp = temp + 1;
						result [b][j] = temp;
						cnt += 1;
						if(cnt == (N*N)) {
							escape = -1;
							break;
						}
					} if (escape == -1) break;
					for (int j = b; j > a; j--) { // ↑ 값 대입
						temp = temp + 1;
						result [j][a] = temp;
						cnt += 1;
						if(cnt == (N*N)) {
							escape = -1;
							break;
						}
					} if (escape == -1) break;
					a++; // 한번 반복이 끝나면 a는 1 올리고, b는 1 내림
					b--;
				}
			} else { // N이 홀수일 경우
				while (cnt <= N/2) { // N/2만큼만 반복
					for (int j = a; j < b; j++) {
						temp = temp + 1;
						result [a][j] = temp;
					} 
					for (int j = a; j < b; j++) {
						temp = temp + 1;
						result [j][b] = temp;
					} 
					for (int j = b; j > a; j--) {
						temp = temp + 1;
						result [b][j] = temp;
					} 
					for (int j = b; j > a; j--) {
						temp = temp + 1;
						result [j][a] = temp;
					} 
					a++;
					b--;
					cnt += 1;
				}
				result[(N/2)][(N/2)] = N*N; // result[(N/2)][(N/2)]의 공간은 비어있고, 항상 N*N 값을 갖게된다.
			}
			
			System.out.println("#" + (i + 1));
			for (int j = 0; j < result.length; j++) {
				for (int k = 0; k < result.length; k++) {
					System.out.print(result[j][k] + " ");
				}
				System.out.println();
			}
			/* 계산법 a = 0, b = N-1
			 * a   a    ~   a   b-1
			 * a   b    ~   b-1   b
			 * b   b    ~   b     a+1
			 * b   a    ~   a+1   a
			 * 의 한 반복을 지나면  a++, b-- 를 통해 외곽에서 안쪽으로 한 줄씩 배열에 입력한다.
			 * 홀수일 경우 가운데 값을 제외한 배열을 채우고 가운데 값은 항상 N*N으로 고정되기 때문에 따로 값을 대입한다.
			 */
			
		}
	}
}
