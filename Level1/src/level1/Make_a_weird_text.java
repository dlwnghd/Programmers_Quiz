package level1;

public class Make_a_weird_text {
	class Solution {
		public String solution(String s) {
			String answer = "";
			String[] temp = s.split(" ", -5); // temp�� s�� ��ĭ���� ��� �迭�� ũ�⸦ -1�� ����
			System.out.println("temp = " + temp.length); // �ؼ��� ���� �߰���

			for (int i = 0; i < temp.length; i++) {
				System.out.println("temp : " + temp[i]); // �ؼ��� ���� �߰���
			}

			for (int i = 0; i < temp.length; i++) { // �ܾ��� ����ŭ �ݺ�
				for (int j = 0; j < temp[i].length(); j++) { // �ܾ��� ���̸�ŭ �ݺ�

					if (j % 2 == 0) { // ���� �ܾ��� ���ڰ� ¦����°���
						if (temp[i].charAt(j) >= 97 && temp[i].charAt(j) <= 122) { // �� ���ڰ� �ҹ��ڶ��
							answer += (char) (temp[i].charAt(j) - 32); // �ҹ��� -> �빮��
							System.out.println(answer); // �ؼ��� ���� �߰���
						} else
							answer += temp[i].charAt(j); // �빮�ڶ�� �״�� ����
						System.out.println(answer); // �ؼ��� ���� �߰���

					} else { // ���� �ܾ��� ���ڰ� Ȧ����°���
						if (temp[i].charAt(j) >= 65 && temp[i].charAt(j) <= 90) { // �� ���ڰ� �빮�ڶ��
							answer += (char) (temp[i].charAt(j) + 32); // �빮�� -> �ҹ���
							System.out.println(answer); // �ؼ��� ���� �߰���
						} else // �ҹ��ڶ�� �״�� ����
							answer += temp[i].charAt(j);
						System.out.println(answer); // �ؼ��� ���� �߰���

					}
				}
				System.out.println("i : " + i + " / temp.length : " + temp.length); // �ؼ��� ���� �߰���
				if (!(i == temp.length - 1)) // �ݺ��� �� �ߴµ� �����ִ� �ܾ�(��ĭ ����)�� �ִٸ�? <- �ؼ��� �̻���
					answer += " "; // answer�� " " �߰�

			}
			return answer; // ���� ����
		}
	}
}
