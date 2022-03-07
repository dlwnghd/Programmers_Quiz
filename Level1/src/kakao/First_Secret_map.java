package kakao;

public class First_Secret_map {
	class Solution {
		public String[] solution(int n, int[] arr1, int[] arr2) {
			// n�� �迭�� ����
			// �ϳ��� "#"�̸� "#" = 1
			// �Ѵ� " " �̶�� " " = 0
			// ���� 1�� arr1 �迭(int)
			// ���� 2�� arr2 �迭(int)
			String[] arr1_1 = new String[n];
			String[] arr2_1 = new String[n];
			String[] answer = new String[n];

			// ���� 1
			// ����1�� 10������ 2������ �迭�� ġ��(int to String)
			for (int i = 0; i < n; i++) {
				arr1_1[i] = Integer.toBinaryString(arr1[i]);

				// ���� 10������ ���̰� n���� �۴ٸ�
				if (n - arr1_1[i].length() != 0) {
					int shor = n - arr1_1[i].length();
					// ª�� ���̸�ŭ 0�� �߰�
					for (int k = 0; k < shor; k++) {
						arr1_1[i] = "0" + arr1_1[i];
					}
				}
				// System.out.println(arr1_1[i]);
			}

			// ���� 2
			// ���� 2�� 10������ 2������ �迭�� ġ��(int to String)
			for (int i = 0; i < n; i++) {
				arr2_1[i] = Integer.toBinaryString(arr2[i]);

				// ���� 10������ ���̰� n���� �۴ٸ�
				if (n - arr2_1[i].length() != 0) {
					int shor = n - arr2_1[i].length();
					// ª�� ���̸�ŭ 0�� �߰�
					for (int k = 0; k < shor; k++) {
						arr2_1[i] = "0" + arr2_1[i];
					}
				}

				// answer�� arr1_1 �ֱ�
				answer = arr1_1;

				// ���� 2�� ����ŭ ����
				for (int j = 0; j < n; j++) {
					// arr2_1[i]��°�� j��° �ܾ '1'�̶��
					if (arr2_1[i].charAt(j) == '1') {
						// answer�� [i]��°�� j��° �ܾ ����
						answer[i] = answer[i].substring(0, j) + '1' + answer[i].substring(j + 1, n);
						// System.out.println("answer["+ i +"] : " + answer[i]);
					}
				}

				// ���� ���ο� �ִ� ���ڰ� 0�̶�� " "
				answer[i] = answer[i].replace("0", " ");
				answer[i] = answer[i].replace("1", "#");
			}
			return answer;
		}
	}
}
