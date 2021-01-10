package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1976 - 210108

Q1976 - 시각 덧셈

시 분으로 이루어진 시각을 2개 입력 받아, 더한 값을 시 분으로 출력하는 프로그램을 작성하라.

(시각은 12시간제로 표시한다. 즉, 시가 가질 수 있는 값은 1시부터 12시이다.)


[제약 사항]

시는 1 이상 12 이하의 정수이다. 분은 0 이상 59 이하의 정수이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 4개의 수가 주어진다.

첫 번째 수가 시를 나타내고 두 번째 수가 분을 나타낸다. 그 다음 같은 형식으로 두 번째 시각이 주어진다.

3 
3 17 1 39
8 22 5 10
6 53 2 12   

[출력]

출력의 각 줄은 '#t'로 시작하고 공백을 한 칸 둔 다음, 시를 출력하고 공백을 한 칸 둔 다음 분을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 4 56
#2 1 32
#3 9 5

*/
public class Q1976 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		String [] result = new String [tc];
		
		for (int i = 0; i < result.length; i++) {
			
			int fHour = sc.nextInt();
			int fMin = sc.nextInt();
			
			int sHour = sc.nextInt();
			int sMin = sc.nextInt();
			
			int rHour = fHour + sHour;
			int rMin = fMin + sMin;
			
			if (rMin > 60) {
				rMin -= 60;
				rHour += 1;
			}
			if (rHour > 12) {
				rHour -= 12;
			}	
			result[i] = rHour + " " + rMin;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println("#" + (i + 1) + " " + result[i]);
		}
	}
}
