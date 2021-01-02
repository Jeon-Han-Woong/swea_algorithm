package algorithm;

/* SW Expert Academy LV.1 / Q.2027 - 201230

주어진 텍스트를 그대로 출력하세요.

출력

#++++
+#+++
++#++
+++#+
++++#

*/

public class Q2027 {
	public static void main(String[] args) {
	
		StringBuilder str = new StringBuilder("+++++");
		
		
		for (int i = 0; i < 5; i++) {
			if (i > 0) {
				str.setCharAt(i-1, '+');
			}
			str.setCharAt(i, '#');
			System.out.println(str);
			
		}	
	}
}
