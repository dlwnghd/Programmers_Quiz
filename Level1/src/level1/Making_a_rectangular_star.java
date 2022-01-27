package level1;
import java.util.Scanner;

public class Making_a_rectangular_star {
	class Solution {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();   // 5
			int b = sc.nextInt();   // 3
			
			for(int i=0; i < b; i++) {	// int값 i는0; i가 b(3)미만동안; i++
				for(int j=0; j < a; j++) {	// int값 j는0; j가 a(5)미만동안; j++
					System.out.print("*");   // "*" 출력
				}
				System.out.println("");	// 줄바꿈
			}
		}
	}
}
