package level1;

public class Remove_the_smallest_number {
	class Solution {
		public int[] solution(int[] arr) {
			int[] answer = new int[arr.length]; // intŸ�� answer�� ũ��� arr�� �迭�� ũ��
			int tap = 0; // intŸ�� tap = 0

			// ���� �ϳ� �ۿ� ���ٸ�
			if (arr.length == 1) {
				answer[0] = -1; // answer�� -1�� ����
				return answer; // answer ���� �� ���α׷� ����
			} else { // ���� �ϳ� �̻��̶��
				answer = new int[(arr.length) - 1]; // answer�� ũ��� (arr�� �迭�� ũ��) -1
			}

			for (int i = 0; i < arr.length; i++) { // ��ü �迭 �ݺ�
				if (arr[tap] <= arr[i]) { // arr�� tap��° �迭�� i��° �迭 ���϶��
					tap = tap;
				} else if (arr[tap] > arr[i]) { // arr�� tap��° �迭�� i��° �迭 �ʰ����
					tap = i;
				}
			}

			for (int i = 0; i < answer.length; i++) { // ��ü �迭 �ݺ�
				if (i != tap) { // i�� tap���� ��ġ ���� �ʴٸ�
					answer[i] = arr[i]; // answer�迭�� �� �߰�
				} else { // i�� tap���� ��ġ �ϴٸ�
					for (int a = i; a < answer.length; a++) {
						answer[a] = arr[a + 1];
					}
					return answer;
				}
			}
			for (int i = 0; i < answer.length; i++) {
			}
			return answer;
		}
	}
}
