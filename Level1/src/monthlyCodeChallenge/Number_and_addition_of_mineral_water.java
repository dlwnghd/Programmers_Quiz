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

	// 다른 분의 더 좋은 풀이
	// 해당 수의 제곱근(루트)를 구하여 그 값으로 나누었을때
	// 0이면 약수의 갯수가 홀수 
	// 아니면 약수의 갯수가 짝수임을 이용
	class Solution2 {
		public int solution(int left, int right) {
			int answer = 0;

			for (int i = left; i <= right; i++) {
				// 제곱수인 경우 약수의 개수가 홀수
				if (i % Math.sqrt(i) == 0) {
					answer -= i;
				}
				// 제곱수가 아닌 경우 약수의 개수가 짝수
				else {
					answer += i;
				}
			}

			return answer;
		}
	}

}
