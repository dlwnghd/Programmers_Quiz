package level1;

public class Finding_the_prime_number {
	public static void main(String[] args) {
		class Solution {
			public int solution(int n) {
				int answer = 0; // ���� ����
				int[] arr = new int[n + 1]; // intŸ���� arr�� n+1���� ������ŭ intŸ������ ������ ����

				// ��� ���� ����
				for (int i = 0; i <= n; i++) { // intŸ�� i; 0���� n���ϱ��� �ݺ�; i++
					arr[i] = i; // arr�� i��° ���� i�̴�
				} // 0��° ���� =1, n-1��° ���� =n�� �ȴ�

				// 1�� �Ҽ��� �ƴ϶� 0�̶�� ���� --> 0�̶�� ��
				arr[1] = 0; // arr�� 1��° ���� 0

				// �Ҽ� ã�� ����
				for (int i = 2; i <= n; i++) {// 2���� ������� intŸ�� i�� 2; i�� n���ϱ��� �ݺ�; i++

					// ���� ������ ã�Ҵ� �Ҽ��� ��� ���� ��� ������ ���� ���� �̵�
					if (arr[i] == 0)
						continue; // arr[i]��° ���� 0�̶�� �ݺ����� ó������ �̵�

					// �����佺�׳׽��� ü�� ���� ����� ���� �Ҽ��� �ƴ϶�� ����
					for (int j = i * 2; j <= n; j += i) { // intŸ�� j�� i*2�̰�; j�� n���ϱ��� �ݺ�; j = j+i -> ����� �����ʰ� �Ҽ��� �ƴ� ����
															// ã��
						arr[j] = 0; // arr�� j��° ���� 0 -> �Ҽ��� �ƴ϶��
					}
				}

				// ���� ���
				for (int i = 0; i < arr.length; i++) { // intŸ�� i�� arr�� ���� �̸����� �ݺ� i++
					if (arr[i] != 0) { // arr�� i��° ���� 0�� �ƴ϶�� -> �Ҽ�
						answer++; // answer++
					}
				}
				return answer;
			}
		}
	}
}
