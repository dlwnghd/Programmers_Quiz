package kakao;

public class First_round_Dart_game {
	class Solution {
		// ������ ���� intŸ������ ������ ��� ���� ���� ���� �־��ָ� �ȴ�
		public int solution(String dartResult) {
			int answer = 0, count = 0, j = 0;
			String[] array = new String[3];
			double[] num = new double[3];

			// ������ ������ 0��° String�� ��(IndexOF)�� �������� ���ڰ� ���� ��� �и�
			// intŸ�� i�� 2����; dartResult �̸�����; i++
			for (int i = 2; i < dartResult.length(); i++) {
				// ���ڶ��
				if (dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57) {
					// 10�̶��
					if (dartResult.charAt(i) == 49 && dartResult.charAt(i + 1) == 48) {
						array[count] = dartResult.substring(j, i);
						j = i; // j�� i����
						count++; // count�� +1
						i++;
						continue;
					}
					// �迭��j���� i������ dartResult�� �ִ� ���� ���
					array[count] = dartResult.substring(j, i); // 0��° 1��°�� ����
					j = i; // j�� i����
					count++; // count�� +1
				}
			}

			// �ݺ��� ���� ������ count�� 2�̶��
			if (count == 2) { // count�� 2�̶��

				// 2��° �迭�� ������ ���� �־���
				array[2] = dartResult.substring(j);
			}

			// @@@@���ʽ�
			// �� ��ȸ���� Single, Double, Tripple�� ���� ��� (��������ϴ� ��� ã�ƺ�����)
			for (int i = 0; i < 3; i++) {
				// 10�̶��
				if (array[i].substring(0, 2).equals("10")) {
					if (array[i].indexOf("S") != -1) {
						// doubleŸ���� num[i]��
						num[i] = Math.pow(Integer.parseInt(array[i].substring(0, 2)), 1);
					} else if (array[i].indexOf("D") != -1) { // Double ��
						num[i] = Math.pow(Double.parseDouble(array[i].substring(0, 2)), 2);
					} else if (array[i].indexOf("T") != -1) { // Triple ��
						num[i] = Math.pow(Double.parseDouble(array[i].substring(0, 2)), 3);
					}
					continue;
				}

				// Single ��
				if (array[i].indexOf("S") != -1) {
					// doubleŸ���� num[i]��
					num[i] = Math.pow(Integer.parseInt(array[i].substring(0, 1)), 1);
				} else if (array[i].indexOf("D") != -1) { // Double ��
					num[i] = Math.pow(Double.parseDouble(array[i].substring(0, 1)), 2);
				} else if (array[i].indexOf("T") != -1) { // Triple ��
					num[i] = Math.pow(Double.parseDouble(array[i].substring(0, 1)), 3);
				}
			}

			// @@@ �ɼ�
			// �� ��ȸ�� �ִ� *, #�� ���� ������ ��ħ(�ƽ�Ű�ڵ� ���)
			for (int i = 0; i < 3; i++) {
				// �ɼ� *
				if (array[i].indexOf("*") != -1) {
					// 0��° ���̶��
					if (i == 0) {
						num[i] = num[i] * 2;
					} else { // �� ���� ���̶��
						num[i] = num[i] * 2;
						num[i - 1] = num[i - 1] * 2;
					}
				} else if (array[i].indexOf("#") != -1) { // �ɼ� #
					num[i] = num[i] * (-1);
				}
			}

			for (double i : num) {
				answer += (int) i;
			}

			// �� ��ȸ������ ��� �� ��� ��ȸ�� ���� ���Ͽ� answer�� intŸ������ ����
			return answer;
		}
	}
}
