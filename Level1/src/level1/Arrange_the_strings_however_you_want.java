package level1;

public class Arrange_the_strings_however_you_want {
	class Solution {
		public String[] solution(String[] strings, int n) {

			String temp = "";
			for (int i = 0; i < strings.length - 1; i++) {
				for (int j = i + 1; j < strings.length; j++) {
					// ���� n��° �ܾ ���� ������ n��° �ܾ�� ũ�ٸ�
					if (strings[i].charAt(n) > strings[j].charAt(n)) {
						// �� �ܾ��� ��ġ�� �ٲپ� ��
						// temp��� ���ڿ��� strings[j] ��° ���ڸ� �ְ�
						temp = strings[j];
						// strings[j] ��°�� strings[i]��° ���ڸ� �ְ�
						strings[j] = strings[i];
						// strings[i]]��°�� trmp�� �ִ´�
						strings[i] = temp;
					} else if (strings[i].charAt(n) == strings[j].charAt(n)) { // ���� n��° �ܾ ���� ������ n��° �ܾ�� ���ٸ�
						// �� �ܾ��� n��° �ܾ ���ٸ�

						// strings��[i]��° �ܾ strings[j]�ܾ�� ������ �� ���������� �� �ռ� �ܾ���
						if (strings[i].compareTo(strings[j]) > 0) {
							// �� �ܾ��� ��ġ�� �ٲپ���

							// temp�� strings�� j��° �� ����
							temp = strings[j];
							// strings�� [j]��° �濡 strings[i]��° ���� ����
							strings[j] = strings[i];
							// strings�� [i]��° �濡�� temp ���� ����
							strings[i] = temp;
						}
					}
				}
			}

			return strings;
		}
	}
}
