package level1;

public class Hashard_number {
	class Solution {
		public boolean solution(int x) {
			boolean answer = true;

			String a = "";
			a = a + x;
			int de_num = 0;
			int[] ar = new int[a.length()];

			for (int i = 0; i < a.length(); i++) {
				ar[i] = (int) a.charAt(i) - 48; // 자리수 int로
			}

			for (int i = 0; i < a.length(); i++) {
				de_num += ar[i];
			}

			if (x % de_num != 0) {
				answer = false;
			}

			return answer;
		}
	}
}
