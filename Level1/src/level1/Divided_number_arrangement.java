package level1;

import java.util.Arrays;

public class Divided_number_arrangement {
	public static void main(String[] args) {

		class Solution {
			public int[] solution(int[] arr, int divisor) {
				int[] answer = null;
				int count = 0;

				// 나누어 지는 수의 갯수 구하기
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] % divisor == 0) {
						count++;
					}
				}

				// answer에 나누어 지는 수만큼 방 생성
				answer = new int[count];

				// 만약 나누어 지는 수가 없을 경우
				if (answer.length == 0) {
					answer = new int[1];
					answer[0] = -1;
					return answer;
				}

				// 나누어 지는 수들을 answer에 넣어줌
				for (int i = 0; i < count; i++) {
					for (int j = i; j < arr.length; j++) {
						if (arr[j] % divisor == 0) {
							answer[i] = arr[j];
							break;
						}
					}
				}
				Arrays.sort(answer);

				return answer;
			}
		}
	}
}
