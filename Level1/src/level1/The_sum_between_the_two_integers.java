package level1;

public class The_sum_between_the_two_integers {
	public static void main(String[] args) {
		class Solution {
			public long solution(int a, int b) {
				long answer = 0;

				// ���� ��
				if (a == b) {
					answer = a;
					return answer;
				}
				// a�� Ŭ ��
				else if (a > b) {
					for (int i = b; i <= a; i++) {
						answer += i;
					}
				} else { // b�� Ŭ ��
					for (int i = a; i <= b; i++) {
						answer += i;
					}
				}

				return answer;
			}
		}
	}
}
