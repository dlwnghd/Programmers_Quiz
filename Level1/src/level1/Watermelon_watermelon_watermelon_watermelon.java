package level1;

public class Watermelon_watermelon_watermelon_watermelon {
	public static void main(String[] args) {
		class Solution {
			public String solution(int n) {
				String answer = "";

				for (int i = 0; i < n; i++) {
					if (i % 2 == 0) {
						answer += "¼ö";
					} else if (i % 2 == 1) {
						answer += "¹Ú";
					}
				}

				return answer;
			}
		}
	}
}
