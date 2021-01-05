package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1989 - 210105

Q1989 - 초심자의 회문 검사

"level" 과 같이 거꾸로 읽어도 제대로 읽은 것과 같은 문장이나 낱말을 회문(回文, palindrome)이라 한다.

단어를 입력 받아 회문이면 1을 출력하고, 아니라면 0을 출력하는 프로그램을 작성하라.


[제약 사항]

각 단어의 길이는 3 이상 10 이하이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에 하나의 단어가 주어진다.

3
level     
samsung
eye

[출력]

출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 1
#2 0
#3 1

*/


public class Q1989 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int [] arr = new int [tc];
		int [] result = new int [tc];
		sc.nextLine();
		
		for (int i = 0; i < arr.length; i++) {
			
			String str = sc.nextLine();
			
			char [] test = str.toCharArray();
			
			for (int j = 0; j < test.length / 2; j++) {
				if (test[j] == test[test.length-1-j]) {
					result[i] = 1;
				} else {
					result[i] = 0;
					break;
				}
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println("#" + (i + 1) + " " + result[i]);
		}
	}
}