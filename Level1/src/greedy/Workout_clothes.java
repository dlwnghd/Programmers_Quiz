package greedy;

import java.util.*;

public class Workout_clothes {

	class Solution {
		public int solution(int n, int[] lost, int[] reserve) {
			
			// ��� ü������ �ִٰ� ����
			// ü������ ����� ��ŭ -
			// ���� ü������ ����ŭ +
			// 2���� ������ �ִٸ�
			// 1. �ؿ� ģ���� 0����� �ֱ�
			// 2. ���� ģ���� 0����� �ֱ�
			// check�� 1��° ����� 30��° ������� check���� ��ŭ��
			// �ִ��� ���� ���� ���� �� ����
			
			
			// intŸ�� answer
			int answer = 0;
			// intŸ�� �迭 check�� 100ĭ
			int[] check = new int[100];

			// check�迭�� �ִ� ���� ���� 1�� ���� ä��
			Arrays.fill(check, 1);

			// 0���� reserve�� ���̸�ŭ �ݺ�
			for (int i = 0; i < reserve.length; i++) {
				// check�� (reserve�� i��° ��)��° �濡 +1
				check[reserve[i]]++;
			}

			// 0���� lost�� ���̸�ŭ �ݺ�
			for (int i = 0; i < lost.length; i++) {
				// check�� (lost�� i��° ��)��° �濡 +1
				check[lost[i]]--;
			}

			// 1���� n�� ������ �� ���� �ݺ�
			for (int i = 1; i <= n; i++) {
				// check�� i��°�� 2�̰� check[i-1]��°�� 0�̶��
				if (check[i] == 2 && check[i - 1] == 0) {
					// check�� i��°�� -1
					check[i]--;
					// check�� i-1��°�� +1
					check[i - 1]++;
				}
				// check�� i��°�� 2�̰� check[i+1]��°�� 0�̶��
				if (check[i] == 2 && check[i + 1] == 0) {
					// check�� i��°�� 2�̰� check[i-1]��°�� 0�̶��
					check[i]--;
					// check�� i+1��°�� +1
					check[i + 1]++;
				}
			}

			// 1���� n�� ������ �� ���� �ݺ�
			for (int i = 1; i <= n; i++) {
				// check[i]��°�� 1���� ũ�ų� ���ٸ� answer +1
				if (check[i] >= 1)
					answer++;
			}

			return answer;
		}
	}
}
