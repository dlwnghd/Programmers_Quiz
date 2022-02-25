package level1;

import java.util.Arrays;

public class Divided_number_arrangement {
	public static void main(String[] args) {

		class Solution {
			public int[] solution(int[] arr, int divisor) {
				int[] answer = null;
				int count = 0;

				// ������ ���� ���� ���� ���ϱ�
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] % divisor == 0) {
						count++;
					}
				}

				// answer�� ������ ���� ����ŭ �� ����
				answer = new int[count];

				// ���� ������ ���� ���� ���� ���
				if (answer.length == 0) {
					answer = new int[1];
					answer[0] = -1;
					return answer;
				}

				// ������ ���� ������ answer�� �־���
				for (int i = 0; i < count; i++) {
					for (int j = i; j < arr.length; j++) {
						if (arr[j] % divisor == 0) {
							answer[i] = arr[j];
							break;
						}
					}
				}
				Arrays.sort(answer);

				return answer;
			}
		}
	}
}