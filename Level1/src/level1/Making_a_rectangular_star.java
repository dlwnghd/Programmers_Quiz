package level1;
import java.util.Scanner;

public class Making_a_rectangular_star {
	class Solution {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();   // 5
			int b = sc.nextInt();   // 3
			
			for(int i=0; i < b; i++) {	// int�� i��0; i�� b(3)�̸�����; i++
				for(int j=0; j < a; j++) {	// int�� j��0; j�� a(5)�̸�����; j++
					System.out.print("*");   // "*" ���
				}
				System.out.println("");	// �ٹٲ�
			}
		}
	}
}
