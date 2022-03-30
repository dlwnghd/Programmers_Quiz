package complete_search;

import java.util.*;

public class Mock_test {
	class Solution {
		public int[] solution(int[] answers) {
			List<Integer> testList = new ArrayList<Integer>();
			int[] number = { 0, 1, 2, 3, 4, 5 };
			int[] people1 = new int[answers.length];
			int[] people2 = new int[answers.length];
			int[] people3 = new int[answers.length];
			int[] correctCount = new int[3];
			int max = 0;

			for (int i = 0; i < answers.length; i++) {
				// 1번 포기자
				people1[i] = number[(i % 5) + 1];

				// 2번 포기자
				switch (i % 8) {
				case 0, 2, 4, 6:
					people2[i] = number[2];
					break;
				case 1:
					people2[i] = number[1];
					break;
				case 3:
					people2[i] = number[3];
					break;
				case 5:
					people2[i] = number[4];
					break;
				case 7:
					people2[i] = number[5];
					break;
				}

				// 3번 포기자
				switch (i % 10) {
				case 0, 1:
					people3[i] = number[3];
					break;
				case 2, 3:
					people3[i] = number[1];
					break;
				case 4, 5:
					people3[i] = number[2];
					break;
				case 6, 7:
					people3[i] = number[4];
					break;
				case 8, 9:
					people3[i] = number[5];
					break;
				}

			}

			// 정답횟수 저장
			for (int i = 0; i < answers.length; i++) {
				if (answers[i] == people1[i]) {
					correctCount[0]++;
				}
				if (answers[i] == people2[i]) {
					correctCount[1]++;
				}
				if (answers[i] == people3[i]) {
					correctCount[2]++;
				}
			}

			// max에 최댓값 저장
			for (int i = 0; i < correctCount.length; i++) {
				if (correctCount[i] > max) {
					max = correctCount[i];
				}
			}
			// System.out.println(max);

			// 최대값과 같다면 추가
			for (int i = 0; i < correctCount.length; i++) {
				if (correctCount[i] == max) {
					// 리스트에 추가
					testList.add(i);
					// System.out.println("i : "+i);
					// System.out.println(correctCount[i]);
					// System.out.println("testList.size : "+testList.size());
				}
			}

			int[] answer = new int[testList.size()];

			for (int i = 0; i < testList.size(); i++) {
				answer[i] = testList.get(i) + 1;
			}

			return answer;
		}
	}
}
