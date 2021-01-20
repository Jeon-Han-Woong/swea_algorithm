package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1946 - 210120

Q1946 - 간단한 압축 풀기

원본 문서는 너비가 10인 여러 줄의 문자열로 이루어져 있다.

문자열은 마지막 줄을 제외하고 빈 공간 없이 알파벳으로 채워져 있고 마지막 줄은 왼쪽부터 채워져 있다.

이 문서를 압축한 문서는 알파벳과 그 알파벳의 연속된 개수로 이루어진 쌍들이 나열되어 있다. (예 : A 5    AAAAA)

압축된 문서를 입력 받아 원본 문서를 만드는 프로그램을 작성하시오.

[예제]
압축된 문서의 내용

A 10
B 7
C 5


압축을 풀었을 때 원본 문서의 내용

AAAAAAAAAA
BBBBBBBCCC
CC


[제약사항]

1. 압축된 문서의 알파벳과 숫자 쌍의 개수 N은1이상 10이하의 정수이다. (1 ≤ N ≤ 10)

2. 주어지는 알파벳 Ci는 A~Z의 대문자이다. (i는 줄의 번호로 1~N까지의 수)

3. 알파벳의 연속된 개수로 주어지는 수 Ki는 1이상 20이하의 정수이다. (1 ≤ Ki ≤ 20, i는 줄의 번호로 1~N까지의 수)

4. 원본 문서의 너비는 10으로 고정이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스에는 N이 주어지고 다음 줄부터 N+1줄까지 Ci와 Ki가 빈 칸을 사이에 두고 주어진다.

1
3
A 10
B 7
C 5   

[출력]

각 줄은 '#t'로 시작하고, 다음 줄부터 원본 문서를 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1
AAAAAAAAAA
BBBBBBBCCC
CC

*/

public class Q1946 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			
			int N = sc.nextInt();
			String arrCi = "";
			int [] arrKi = new int [N];
			int sum = 0;
			
			for (int j = 0; j < N; j++) {
				arrCi += sc.next(); // 알파벳을 arrCi에 담는다.
				arrKi[j] = sc.nextInt(); // 각 알파벳의 개수를 arrKi에 담는다.
				sum += arrKi[j]; // 알파벳의 총 개수
			}
			String str = "";

			int cnt = 0; // str에 알파벳 전체 개수만큼 대입할 때 필요한 변수
			int next = 0; // 알파벳 하나의 입력이 끝나면 다음 알파벳의 개수를 불러오는 변수
			int k = 0; // 해당 알파벳을 입력하기 위한 변수
			while(cnt <= sum-1) {
				str += arrCi.charAt(k);
				cnt++;
				next++;
				if (next == arrKi[k]) { // next가 알파벳의 개수와 같아지면 다음 알파벳으로 바꾸고 next를 0으로 초기화.
					k++;
					next = 0;
				}
			}
			
			System.out.println("#" + (i + 1));
			for (int j = 0; j < str.length(); j++) { // 모든 알파벳을 출력
				System.out.print(str.charAt(j)); 
				if (j % 10 == 9) { // 10번째줄이 될 때 마다 개행한다.
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}
