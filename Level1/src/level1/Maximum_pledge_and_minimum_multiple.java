package level1;

public class Maximum_pledge_and_minimum_multiple {
	class Solution {
		public int[] solution(int n, int m) {
			int[] answer = new int[2];

			for (int i = 1; i < n + m; i++) { // int��1; i�� n+m���� ���� ���� �ݺ�; i++
				if (n % i == 0 && m % i == 0) { // n % i�� 0�̰� m % i�� 0�̶��
					answer[0] = i; // �ִ������� i
					answer[1] = n * m / answer[0]; // �ִ� ������� n*m/�ִ�����
				}
			}
			return answer;
		}
	}
}
