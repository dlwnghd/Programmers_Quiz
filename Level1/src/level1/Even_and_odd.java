package level1;

public class Even_and_odd {
	class Solution {
		public String solution(int num) {
			String answer = "";

			if (num < 0) { // 擠熱檣 唳辦
				num = num * -1;
				if (num % 2 == 1) { // 擠熱 ?汝?
					answer = "Odd";
				} else if (num % 2 == 0 || num == 0) { // 擠熱 礎熱
					answer = "Even";
				}
			} else {
				if (num % 2 == 1) { // 曄熱 ?汝?
					answer = "Odd";
				} else if (num % 2 == 0 || num == 0) { // 曄熱 礎熱
					answer = "Even";
				}
			}

			return answer;
		}
	}
}
