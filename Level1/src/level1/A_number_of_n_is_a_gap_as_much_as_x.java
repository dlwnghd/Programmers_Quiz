package level1;

public class A_number_of_n_is_a_gap_as_much_as_x {
	class Solution {
		public long[] solution(long x, int n) {
			long[] answer = new long[n]; // answer��� �迭�� �������, �� �迭�� ���� �־��شٰ� ������ �� �߳� ������

			for (int i = 0; i < n; i++) { // int�� i��0; i�� n�̸� ����; i++
				answer[i] = x * (i + 1); // answer[i]���� x�� ����
			}

			return answer; // answer���� ������
		}
	}
}
