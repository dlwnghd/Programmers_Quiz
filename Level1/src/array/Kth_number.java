package array;

import java.util.ArrayList;
import java.util.Collections;

public class Kth_number {
	class Solution {
		public int[] solution(int[] array, int[][] commands) {
			int[] answer = new int[commands.length];

			// 커맨드의 길이만큼 반복
			for (int i = 0; i < commands.length; i++) { // i = 0,1,2
				// 배열의 길이를 모르기 때문에 list로 선언
				ArrayList<Integer> list = new ArrayList<Integer>();

				// 리스트에 i번째 숫자부터 j번째 숫자까지 넣어줌
				for (int j = commands[i][0]; j <= commands[i][1]; j++) { // j = 5,4,7
					// 리스트에 array의 j-1번째 방 값을 추가
					list.add(array[j - 1]);
				}

				// 리스트 정렬하기
				Collections.sort(list);

				// k번째 값 answer에 추가하기
				answer[i] = list.get(commands[i][2] - 1);
			}

			return answer;
		}
	}
}
