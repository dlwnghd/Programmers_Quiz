package summer_winter_coding;

import java.util.Arrays;

public class Budget {

	class Solution {
		public int solution(int[] d, int budget) {
			int answer = 0;
			int result = 0;
			// 1. ������������ ������
			Arrays.sort(d);

			// ���� ������ ���Ͽ� ���� �ִ��� ���� �� ��
			for (int i = 0; i < d.length; i++) {
				// result�� d[i]��° ���� ������
				result += d[i];
				// ���� result�� ���� budget���� ũ��
				if (result > budget) {
					// answer�� i
					answer = i;
					break;
				}
			}
			// ���� result�� budget���� �۰ų� ������ ������ ���� ���
			if (result <= budget) {
				// answer�� d.length : ��� ��ǰ�� �� �� �� �ִ�.
				answer = d.length;
			}

			return answer;
		}
	}
}