package summer_winter_coding;

import java.util.Arrays;

public class Budget {

	class Solution {
		public int solution(int[] d, int budget) {
			int answer = 0;
			int result = 0;
			// 1. 오름차순으로 재정렬
			Arrays.sort(d);

			// 작은 수부터 더하여 가장 최대의 값을 낼 것
			for (int i = 0; i < d.length; i++) {
				// result에 d[i]번째 값을 더해줌
				result += d[i];
				// 만약 result의 값이 budget보다 크면
				if (result > budget) {
					// answer는 i
					answer = i;
					break;
				}
			}
			// 만약 result가 budget보다 작거나 같으면 예산이 남는 경우
			if (result <= budget) {
				// answer는 d.length : 모든 물품을 다 살 수 있다.
				answer = d.length;
			}

			return answer;
		}
	}
}