package level1;

public class Finding_Kim_Seobang_in_Seoul {
	public static void main(String[] args) {
		class Solution {
			public String solution(String[] seoul) {
				// StringŸ�� ���ǹ�
				String answer = "", kim = "�輭���� ", exist = "�� �ִ�";

				// intŸ�� i�� 0; seoul.length���� �̸����� �ݺ�; i++
				for (int i = 0; i < seoul.length; i++) {
					// seoul[i]�� "Kim"�̶�� ���� ��ġ�Ѵٸ�
					if (seoul[i].equals("Kim")) {
						// answer ����
						answer = kim + i + exist;
						// �ݺ��� Ż��
						break;
					}
				}
				// ���� ����
				return answer;
			}
		}
	}
}
