package level1;

public class Even_and_odd {
	class Solution {
		public String solution(int num) {
			String answer = "";

			if (num < 0) { // ������ ���
				num = num * -1;
				if (num % 2 == 1) { // ���� Ȧ��
					answer = "Odd";
				} else if (num % 2 == 0 || num == 0) { // ���� ¦��
					answer = "Even";
				}
			} else {
				if (num % 2 == 1) { // ��� Ȧ��
					answer = "Odd";
				} else if (num % 2 == 0 || num == 0) { // ��� ¦��
					answer = "Even";
				}
			}

			return answer;
		}
	}
}
