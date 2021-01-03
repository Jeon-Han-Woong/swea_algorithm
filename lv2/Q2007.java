package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.2007 - 210103

패턴에서 반복되는 부분을 마디라고 부른다. 문자열을 입력 받아 마디의 길이를 출력하는 프로그램을 작성하라.


[제약 사항]

각 문자열의 길이는 30이다. 마디의 최대 길이는 10이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 길이가 30인 문자열이 주어진다.

3       
KOREAKOREAKOREAKOREAKOREAKOREA
SAMSUNGSAMSUNGSAMSUNGSAMSUNGSA
GALAXYGALAXYGALAXYGALAXYGALAXY 

[출력]

출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 5
#2 7
#3 6

*/

public class Q2007 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int [] arr = new int[tc];
		sc.nextLine(); // 입력 오류 방지
		
		for (int i = 0; i < arr.length; i++) {
			
			String s = sc.nextLine();
			
			char a = s.charAt(0);
			char b = s.charAt(1);
			
			int result = 0;
			
			for (int j = 2; j < s.length(); j++) {
				if (a == s.charAt(j)) {
					if (b == s.charAt(j+1)) {
						result = j;
						break; // 마디 계산 후 반복 탈출
					}
				}
			}
			arr[i] = result;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("#" + (i + 1) + " " + arr[i]);
		}
	}
}
