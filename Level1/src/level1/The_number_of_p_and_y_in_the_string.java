package level1;

public class The_number_of_p_and_y_in_the_string {
	public static void main(String[] args) {
		class Solution {
			boolean solution(String s) {
				boolean answer = true;
				// 1.'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False
				// 2.'p','y'��� �ϳ��� ���� ���� �׻� True
				// 3. ������ ���� �� �빮�ڿ� �ҹ��ڸ� �������� ����

				// ������ ���� ��ŭ charŸ�� �迭 ����
				char[] sentence = new char[s.length()];

				// ������ ���ִ� intŸ�� count����
				int pCount = 0, yCount = 0;

				// �迭�� ������ �ܾ� �ϳ��ϳ� �ֱ�
				for (int i = 0; i < s.length(); i++) {
					sentence[i] = s.charAt(i);
				}

				// ���忡�� p�� yã��
				for (int i = 0; i < s.length(); i++) {
					// 80(P), 112(p)
					// charŸ���̱� ������ .equals()�޼ҵ�� ����� �Ұ���
					if (sentence[i] == 'P' || sentence[i] == 'p') {
						pCount++;
					} else if (sentence[i] == 'Y' || sentence[i] == 'y') { // 89(Y), 121(y)
						yCount++;
					}
				}

				// p�� ������ y�� ������ ��
				if (pCount == yCount) {
					answer = true;
				} else if (pCount == 0 && yCount == 0) {
					answer = true;
				} else {
					answer = false;
				}

				return answer;
			}
		}
	}
}
