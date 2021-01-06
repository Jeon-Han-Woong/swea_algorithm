package algorithm_lv2;

import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1984 - 210106

Q1984 - 중간 평균값 구하기

10개의 수를 입력 받아, 최대 수와 최소 수를 제외한 나머지의 평균값을 출력하는 프로그램을 작성하라.

(소수점 첫째 자리에서 반올림한 정수를 출력한다.)


[제약 사항]

각 수는 0 이상 10000 이하의 정수이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.

3      
3 17 1 39 8 41 2 32 99 2 
22 8 5 123 7 2 63 7 3 46 
6 63 2 3 58 76 21 33 8 1   

[출력]

출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 18
#2 20
#3 24

*/

public class Q1984 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		long [] result = new long [tc];
		
		for (int i = 0; i < result.length; i++) {
			
			int [] arr = new int [10];
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			for (int j = 0; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[j] < arr[k]) {
						int temp = arr[j];
						arr[j] = arr[k];
						arr[k] = temp;
					}
				}
			}
			int sum = 0;
			for (int j = 1; j < arr.length-1; j++) {
				sum += arr[j];
			}
			double tem = sum / 8.0;
			long avg = Math.round(tem);
			
			result[i] = avg;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println("#" + (i + 1) + " " + result[i]);	
		}
	}
}
