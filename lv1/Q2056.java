package algorithm;

import java.util.Scanner;

/* SW Expert Academy LV.1 / Q.2056 - 201229

연월일 순으로 구성된 8자리의 날짜가 입력으로 주어진다.

 [그림1] - 22220228 -> 2222/02/28
 

해당 날짜의 유효성을 판단한 후, 날짜가 유효하다면

[그림1] 과 같이 ”YYYY/MM/DD”형식으로 출력하고,

날짜가 유효하지 않을 경우, -1 을 출력하는 프로그램을 작성하라.


연월일로 구성된 입력에서 월은 1~12 사이 값을 가져야 하며

일은 [표1] 과 같이, 1일 ~ 각각의 달에 해당하는 날짜까지의 값을 가질 수 있다.
 
 [표1]
		1, 3, 5, 7, 8, 10, 12 -> 1일 ~ 31일
		4, 6, 9, 11 -> 1일 ~ 30일
		2 -> 1일 ~ 28일

※ 2월의 경우, 28일인 경우만 고려한다. (윤년은 고려하지 않는다.)


[입력]

입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.

다음 줄부터 각 테스트 케이스가 주어진다.

5
22220228
20150002
01010101
20140230
11111111

[출력]

테스트 케이스 t에 대한 결과는 “#t”을 찍고, 한 칸 띄고, 정답을 출력한다.

(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

#1 2222/02/28
#2 -1
#3 0101/01/01
#4 -1
#5 1111/11/11

*/
public class Q2056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] arr = new String[n];
		String [] result = new String[n];
		
		for (int i = 0; i < arr.length; i++) {
			String x = sc.next();
			arr[i] = x;
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i].substring(4, 6).equals("01")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 31) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("02")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 28) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("03")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 31) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("04")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 30) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("05")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 31) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("06")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 30) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("07")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 31) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("08")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 31) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("09")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 30) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("10")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 31) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("11")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 30) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else if(arr[i].substring(4, 6).equals("12")) {
				if(Integer.parseInt(arr[i].substring(6)) >= 1 && Integer.parseInt(arr[i].substring(6)) <= 31) {
					result[i] = arr[i].substring(0, 4) + "/" + arr[i].substring(4, 6) + "/" + arr[i].substring(6);
				} else {
					result[i] = "-1";
				}
			} else {
				result[i] = "-1";
			}		
		}	
		for (int j = 0; j < result.length; j++) {
			System.out.println("#" + (j + 1) + " " + result[j]);
		}
	}
}
