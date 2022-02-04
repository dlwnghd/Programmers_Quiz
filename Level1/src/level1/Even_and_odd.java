package level1;

public class Even_and_odd {
	class Solution {
		public String solution(int num) {
			String answer = "";

			if (num < 0) { // À½¼öÀÎ °æ¿ì
				num = num * -1;
				if (num % 2 == 1) { // À½¼ö È¦¼ö
					answer = "Odd";
				} else if (num % 2 == 0 || num == 0) { // À½¼ö Â¦¼ö
					answer = "Even";
				}
			} else {
				if (num % 2 == 1) { // ¾ç¼ö È¦¼ö
					answer = "Odd";
				} else if (num % 2 == 0 || num == 0) { // ¾ç¼ö Â¦¼ö
					answer = "Even";
				}
			}

			return answer;
		}
	}
}
