package level1;

public class Guess_what_it_is {
	class Solution {
		public int solution(int num) {
			int answer = 0;

			for (int i = 0; i < 500; i++) {
				if (num == 1) { // Â¦¼ö¶ó¸é
					break;
				} else if (num % 2 == 1) { // È¦¼ö¶ó¸é
					num = (num * 3) + 1;
				} else if (num % 2 == 0) {
					num = num / 2;
				}
				answer++;
			}

			if (answer >= 500) {
				answer = -1;
			}

			System.out.println(answer);
			return answer;
		}
	}
}
