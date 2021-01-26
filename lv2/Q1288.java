package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1288 - 210126

Q1288 - 새로운 불면증 치료법

민석이는 불면증에 걸렸다. 그래서 잠이 안 올 때의 민간요법 중 하나인 양 세기를 하려고 한다.

민석이는 1번 양부터 순서대로 세는 것이 재미없을 것 같아서 N의 배수 번호인 양을 세기로 하였다.

즉, 첫 번째에는 N번 양을 세고, 두 번째에는 2N번 양, … , k번째에는 kN번 양을 센다.

이렇게 숫자를 세던 민석이에게 잠은 더 오지 않고 다음과 같은 궁금증이 생겼다.

이전에 셌던 번호들의 각 자리수에서 0에서 9까지의 모든 숫자를 보는 것은 최소 몇 번 양을 센 시점일까?

예를 들어 N = 1295이라고 하자.

첫 번째로 N = 1295번 양을 센다. 현재 본 숫자는 1, 2, 5, 9이다.

두 번째로 2N = 2590번 양을 센다. 현재 본 숫자는 0, 2, 5, 9이다.

현재까지 본 숫자는 0, 1, 2, 5, 9이다.

세 번째로 3N = 3885번 양을 센다. 현재 본 숫자는 3, 5, 8이다.

현재까지 본 숫자는 0, 1, 2, 3, 5, 8, 9이다.

네 번째로 4N = 5180번 양을 센다. 현재 본 숫자는 0, 1, 5, 8이다.

현재까지 본 숫자는 0, 1, 2, 3, 5, 8, 9이다.

다섯 번째로 5N = 6475번 양을 센다. 현재 본 숫자는 4, 5, 6, 7이다.

현재까지 본 숫자는 0, 1, 2, 3, 4, 5, 6, 7, 8, 9이다.

5N번 양을 세면 0에서 9까지 모든 숫자를 보게 되므로 민석이는 양 세기를 멈춘다.

[입력]

첫 번째 줄에 테스트 케이스의 수 T가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 N (1 ≤ N ≤ 106)이 주어진다.

5
1
2
11
1295
1692

[출력]

각 테스트 케이스마다 ‘#x’(x는 테스트케이스 번호를 의미하며 1부터 시작한다)를 출력하고,

최소 몇 번 양을 세었을 때 이전에 봤던 숫자들의 자릿수에서 0에서 9까지의 모든 숫자를 보게 되는지 출력한다.

( 민석이는 xN번 양을 세고 있다. )

#1 10
#2 90
#3 110
#4 6475
#5 5076

*/

public class Q1288 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		int [] result = new int [tc];
		
		for (int i = 0; i < result.length; i++) {
			
			char [] allNum = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // 모든 숫자들이 들어있는 배열 선언
			
			int escape = 0; // while문 탈출조건
			int cnt = 1; // N의 배수를 세기 위한 값
			int N = sc.nextInt();
			
			while(escape == 0) { // escape가 0일 때 반복
				String str = Integer.toString(N * cnt); // N * cnt를 String으로 변환
				
				char [] arr = str.toCharArray(); // String을 char 배열로 변환
				
				for (int j = 0; j < arr.length; j++) { // 배열의 수가 allNum에 들어있으면, allNum의 해당 값을 X로 변환
					for (int k = 0; k < allNum.length; k++) {
						if (arr[j] == allNum[k]) {
							allNum[k] = 'X';
						}
					}
				}
				
				int temp = 0; // X의 개수를 세는 변수
				for (int j = 0; j < allNum.length; j++) {
					if (allNum[j] == 'X') { // allNum[j]의 값이 X이면 temp를 1 증가
						temp++;
					}		
					if (temp == allNum.length) { // 0~9까지의 모든 수가 X로 변환되어 있으면, escape를 1로 변환하여 반복문 탈출
						escape = 1;
					} 
				}
				cnt++; // N을 배수로 세기 위해서 cnt값을 1씩 증가
			}			
			result[i] = N * (cnt-1); // 반복문 탈출 전 cnt가 1 증가했으므로, 1을 감소하여 결과값 계산
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println("#" + (i + 1) + " " + result[i]);
		}
	}
}
