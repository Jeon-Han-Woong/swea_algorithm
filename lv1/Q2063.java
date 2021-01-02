package algorithm;

import java.util.Scanner;

/* SW Expert Academy LV.1 / Q.2063 - 201228
  
중간값은 통계 집단의 수치를 크기 순으로 배열 했을 때 전체의 중앙에 위치하는 수치를 뜻한다.

입력으로 N 개의 점수가 주어졌을 때, 중간값을 출력하라.


[예제]

N이 9 이고, 9개의 점수가 아래와 같이 주어질 경우,

85 72 38 80 69 65 68 96 22

69이 중간값이 된다.


[제약 사항]

1. N은 항상 홀수로 주어진다.

2. N은 9이상 199 이하의 정수이다. (9 ≤ N ≤ 199)


[입력]

입력은 첫 줄에 N 이 주어진다.

둘째 줄에 N 개의 점수가 주어진다.

199
85 72 38 80 69 65 68 96 22 49 67 51 61 63 87 66 24 80 83 71
60 64 52 90 60 49 31 23 99 94 11 25 24 51 15 13 39 67 97 19
76 12 33 99 18 92 35 74 0 95 71 39 33 39 32 37 45 57 71 95 5
71 24 86 8 51 54 74 24 75 70 33 63 29 99 59 94 52 13 35 99 46
57 71 23 17 3 94 48 77 18 83 11 83 25 59 62 2 78 86 7 94 65 80
32 39 84 60 65 72 61 58 84 8 72 12 19 47 49 49 59 71 52 34 22
21 20 92 33 80 39 74 9 28 97 100 93 29 25 4 66 79 81 98 21 91
62 82 4 59 100 34 1 51 80 92 69 77 39 38 97 51 34 35 19 22 1
67 9 90 31 82 11 51 84 78 70 74 42 100 88 53 80 57 62 32 51 48
63 92 46 4 61 31 98 69 52 88 20


[출력]

N 개의 점수들 중, 중간값에 해당하는 점수를 정답으로 출력한다.

58

5 3 7 9
 */


public class Q2063 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[199];
		int temp = 0;
		int n = sc.nextInt();
		if (n % 2 == 1 && n >= 9 && n <= 199) {
			for (int i = 0; i < n; i++) {
					int a = sc.nextInt();
					arr[i] = a;
			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			int [] arr2 = new int[n];
			
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = arr[i];
			}
			
			System.out.println(arr2[(arr2.length/2)]);
			
		} else {
			System.exit(0);
		}
	}
}
