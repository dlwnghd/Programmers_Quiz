package weekly;

import java.util.Arrays;

public class At_least_a_rectangle {
	class Solution {
		public static int GetAbsoluteValue(int a) {
			return Math.abs(a);
		}

		public int solution(int[][] sizes) {
			int answer = 0;
			int[] maxSize = { 0, 0 };
			System.out.println(sizes[0][0]);

			for (int i = 0; i < sizes.length; i++) {
				for (int j = 0; j < sizes[0].length; j++) {
					if (sizes[i][1] > sizes[i][0]) {
						sizes[i][1] = sizes[i][1] - sizes[i][0];
						sizes[i][0] = sizes[i][1] + sizes[i][0];
						sizes[i][1] = GetAbsoluteValue(sizes[i][1] - sizes[i][0]);
					}

					if (sizes[i][j] > maxSize[j]) {
						maxSize[j] = sizes[i][j];
					}
				}
			}

			return answer = maxSize[0] * maxSize[1];
		}
	}
}
