package algorithm;

import java.util.Scanner;

/* SW Expert Academy LV.1 / Q.2050 - 201229
 
알파벳으로 이루어진 문자열을 입력 받아 각 알파벳을 1부터 26까지의 숫자로 변환하여 출력하라.


[제약 사항]

문자열의 최대 길이는 200이다.


[입력]

알파벳으로 이루어진 문자열이 주어진다.

ABCDEFGHIJKLMNOPQRSTUVWXYZ

[출력]

각 알파벳을 숫자로 변환한 결과값을 빈 칸을 두고 출력한다.

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26

 */


public class Q2050 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char [] arr = n.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(((int) arr[i] - 64) + " ");
		}		
	}
}
