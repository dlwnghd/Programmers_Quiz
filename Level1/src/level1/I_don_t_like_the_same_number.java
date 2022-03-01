package level1;

import java.util.*;

public class I_don_t_like_the_same_number {
	public class Solution {
		public int[] solution(int[] arr) {
			int[] answer = {};
			int answer_length = 0, count = 0;

			for (int i = 0; i < arr.length; i++) {
				if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
					continue;
				}
				answer_length++;
			}

			answer = new int[answer_length];

			for (int i = 0; i < arr.length; i++) {
				if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
					continue;
				}
				answer[count] = arr[i];
				count++;
			}

			return answer;
		}
	}
}
