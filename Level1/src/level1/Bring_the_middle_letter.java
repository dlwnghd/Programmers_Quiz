package level1;

public class Bring_the_middle_letter {
	class Solution {
		public String solution(String s) {
			String answer = "";

//	         012345
//	         ¦�� ���̶��
//	         �ۼ�Ʈ�� �� ��� ����� �ʹ� ���� �ɸ�
//	         ¦���� 2�� ���������� ������(�Ҽ����� ������ ��)�� ���� ��

//	         ���ǹ� Ǯ��
			// if((s.length()/2.0) == s.length()/2){
			// answer += s.charAt((s.length()/2)-1);
			// }
			// answer += s.charAt(s.length()/2);
			// return answer;

			// substring(������ġ, ������ ��ġ)�� ����� Ǯ��
			return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
		}
	}
}
