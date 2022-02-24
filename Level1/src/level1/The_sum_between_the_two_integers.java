package level1;

public class The_sum_between_the_two_integers {
	public static void main(String[] args) {
		class Solution {
			public long solution(int a, int b) {
				long answer = 0;

				// 같을 때
				if (a == b) {
					answer = a;
					return answer;
				}
				// a가 클 때
				else if (a > b) {
					for (int i = b; i <= a; i++) {
						answer += i;
					}
				} else { // b가 클 때
					for (int i = a; i <= b; i++) {
						answer += i;
					}
				}

				return answer;
			}
		}
	}
}
