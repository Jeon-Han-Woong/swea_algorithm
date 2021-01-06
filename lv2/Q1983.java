package algorithm_lv2;

import java.util.Arrays;
import java.util.Scanner;

/* SW Expert Academy LV.2 / Q.1983 - 210106

Q1983 - 조교의 성적 매기기

학기가 끝나고, 학생들의 점수로 학점을 계산중이다.

학점은 상대평가로 주어지는데, 총 10개의 평점이 있다.

A+ A0 A- B+ B0 B- C+ C0 C- D0

학점은 학생들이 응시한 중간/기말고사 점수 결과 및 과제 점수가 반영한다.

각각 아래 비율로 반영된다.

총점 = 중간고사 (35%) + 기말고사 (45%) + 과제 (20%)

10 개의 평점을 총점이 높은 순서대로 부여하는데,

각각의 평점은 같은 비율로 부여할 수 있다.

예를 들어, N 명의 학생이 있을 경우 N/10 명의 학생들에게 동일한 평점을 부여할 수 있다.

입력으로 각각의 학생들의 중간, 기말, 과제 점수가 주어지고,

학점을 알고싶은 K 번째 학생의 번호가 주어졌을 때,

K 번째 학생의 학점을 출력하는 프로그램을 작성하라.


[제약사항]

1. N은 항상 10의 배수이며, 10이상 100이하의 정수이다. (10 ≤ N ≤ 100)

2. K는 1 이상 N 이하의 정수이다. (1 ≤ K ≤ N)

3. K 번째 학생의 총점과 다른 학생의 총점이 동일한 경우는 입력으로 주어지지 않는다.


[입력]

입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.

다음 줄부터 각 테스트 케이스가 주어진다.

테스트 케이스의 첫 번째 줄은 학생수 N 과, 학점을 알고싶은 학생의 번호 K 가 주어진다.

테스트 케이스 두 번째 줄 부터 각각의 학생이 받은 시험 및 과제 점수가 주어진다.

10
10 2
87 59 88
99 94 78
...

[출력]

테스트 케이스 t에 대한 결과는 “#t”을 찍고, 한 칸 띄고, 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 A-
...

 */

public class Q1983 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		String [] result = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
		
		for (int i = 0; i < tc; i++) {
			
			int stu = sc.nextInt();
			int [] student = new int [stu];
			
			int n = sc.nextInt(); // n 번째 학생수
			
			for (int j = 0; j < student.length; j++) {
				
				int [] arr = new int [3];
				
				int mid = sc.nextInt();
				int fin = sc.nextInt();
				int hw = sc.nextInt();
				
				int sum = mid * 35 + fin * 45 + hw * 20;
		
				student[j] = sum;
				
			}
			int score = student[n-1];
			Arrays.sort(student);

			int index = 0;
			for (int j = 0; j < student.length; j++) {
				if (student[j] == score) {
					index = j;
					break;
				}
			}
			int s = index/(stu/10);
			System.out.println("#" + (i + 1) + " " + result[s]);
		}
	}
}
