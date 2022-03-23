package monthlyCodeChallenge;

public class Number_and_addition_of_mineral_water {
	class Solution {
		public int solution(int left, int right) {
			int answer = 0;
			int count = 0;

			for (int i = left; i <= right; i++) {
				for (int j = 1; j <= right; j++) {
					// 약수라면
					if (i % j == 0) {
						count++;
					}
				}
				// 약수의 갯수가 짝수라면
				if (count % 2 == 0) {
					answer += i;
				} else { // 약수의 갯수가 홀수라면
					answer -= i;
				}
				count = 0;
			}
			return answer;
		}
	}
}
