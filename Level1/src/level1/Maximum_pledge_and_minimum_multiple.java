package level1;

public class Maximum_pledge_and_minimum_multiple {
	class Solution {
		public int[] solution(int n, int m) {
			int[] answer = new int[2];

			for (int i = 1; i < n + m; i++) { // int는1; i가 n+m보다 작은 동안 반복; i++
				if (n % i == 0 && m % i == 0) { // n % i가 0이고 m % i가 0이라면
					answer[0] = i; // 최대공약수는 i
					answer[1] = n * m / answer[0]; // 최대 공배수는 n*m/최대공약수
				}
			}
			return answer;
		}
	}
}
