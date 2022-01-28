package level1;

public class A_number_of_n_is_a_gap_as_much_as_x {
	class Solution {
		public long[] solution(long x, int n) {
			long[] answer = new long[n]; // answer라는 배열을 만들어줌, 아 배열에 값을 넣어준다고 선언을 안 했네 슈벌탱

			for (int i = 0; i < n; i++) { // int값 i는0; i가 n미만 동안; i++
				answer[i] = x * (i + 1); // answer[i]값에 x를 대입
			}

			return answer; // answer값을 돌려줌
		}
	}
}
