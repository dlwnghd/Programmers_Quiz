package level1;

public class Year_of_2016 {
	class Solution {
		public String solution(int a, int b) {
			String answer = "";
			String[] arrDay = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
			int day = 0;
			// 0, 1, 2, 3, 4, 5, 6
			// ��, ȭ, ��, ��, ��, ��, ��

			// 1 �ݿ��� ����
			// 2 ������ ����
			// 3 ȭ���� ����
			// 4 �ݿ��� ����
			// 5 �Ͽ��� ����
			// 6 ������ ����
			// 7 �ݿ��� ����
			// 8 ������ ����
			// 9 ����� ����
			// 10 ����� ����
			// 11 ȭ���� ����
			// 12 ����� ����
			switch (a) {
			// ������
			case 2, 8:
				day = 0;
				break;
			// ȭ����
			case 3, 11:
				day = 1;
				break;
			// ������
			case 6:// 5
				day = 2;
				break;
			// �����
			case 9, 12:
				day = 3;
				break;
			// �ݿ���
			case 1, 4, 7:
				day = 4;
				break;
			// �����
			case 10:
				day = 5;
				break;
			// �Ͽ���
			case 5:
				day = 6;
				break;
			}
			day = (day + b) % 7;
			answer = arrDay[day];

			return answer;
		}
	}
}
