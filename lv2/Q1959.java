package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1961 - 210114

Q1959 - 두 개의 숫자열

N 개의 숫자로 구성된 숫자열 Ai (i=1~N) 와 M 개의 숫자로 구성된 숫자열 Bj (j=1~M) 가 있다.

아래는 N =3 인 Ai 와 M = 5 인 Bj 의 예이다.


Ai 나 Bj 를 자유롭게 움직여서 숫자들이 서로 마주보는 위치를 변경할 수 있다.

단, 더 긴 쪽의 양끝을 벗어나서는 안 된다.
 
Ai = 1 5 3

Bj = 3 6 -7 5 4


서로 마주보는 숫자들을 곱한 뒤 모두 더할 때 최댓값을 구하라.

위 예제의 정답은 아래와 같이 30 이 된다.
 
Ai =      1 5 3
          * * *
Bj = 3 6 -7 5 4
         -7 25 12 -> 30

[제약 사항]

N 과 M은 3 이상 20 이하이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에 N 과 M 이 주어지고,

두 번째 줄에는 Ai,

세 번째 줄에는 Bj 가 주어진다.

10
3 5
1 5 3
3 6 -7 5 4
7 6
6 0 5 5 -1 1 6
-4 1 8 7 -9 3
...

[출력]

출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 30
#2 63
...

*/

public class Q1959 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		int [] result = new int [tc];
		
		for (int i = 0; i < result.length; i++) {
			int N = sc.nextInt(); 
			int [] arrA = new int [N];
			
			int M = sc.nextInt();
			int [] arrB = new int [M];
			
			for (int j = 0; j < arrA.length; j++) {
				arrA[j] = sc.nextInt(); // 배열 A 입력
			}
			
			for (int j = 0; j < arrB.length; j++) {
				arrB[j] = sc.nextInt(); // 배열 B 입력
			}
			
			int sum = 0;
			if (N < M) { // 배열 A의 길이가 B의 길이보다 작을 경우
				int cnt = 0;
				while (cnt <= M-N) { // 반복횟수는 B의 길이 - A의 길이
					int temp = 0;
					for (int j = 0; j < arrA.length; j++) { // 길이가 더 작은 A만큼 반복
						temp = temp + (arrA[j] * arrB[j+cnt]); // 임시로 계산값 저장
					}					
					if (sum <= temp) { // 임시 저장된 값이 더 클 경우 sum에 저장
						sum = temp;
					}
					cnt++; // cnt를 통해 반복문 탈출
				}
			} else if (M < N) { // 배열 B의 길이가 A의 길이보다 작을 경우
				int cnt = 0;
				while (cnt <= N-M) { // 반복횟수는 A의 길이 - B의 길이
					int temp = 0;
					for (int j = 0; j < arrB.length; j++) { // 길이가 더 작은 B만큼 반복
						temp = temp + (arrA[j+cnt] * arrB[j]); // 임시로 계산값 저장
					}					
					if (sum <= temp) { // 임시 저장된 값이 더 클 경우 sum에 저장
						sum = temp;
					}
					cnt++; // cnt를 통해 반복문 탈출
				}
			} else { // 배열 A와 B의 길이가 같을 때
				for (int j = 0; j < arrB.length; j++) { // 마주보는 값 계산
					sum = sum + (arrA[j] * arrB[j]);
				}	
			}
			result[i] = sum; // 테스트 케이스 배열에 값을 저장
		}
		for (int i = 0; i < result.length; i++) { // 테스트 케이스 결과 출력
			System.out.println("#" + (i + 1) + " " + result[i]);
		}
	}
}
