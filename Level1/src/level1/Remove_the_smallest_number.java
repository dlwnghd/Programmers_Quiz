package level1;

public class Remove_the_smallest_number {
	class Solution {
		public int[] solution(int[] arr) {
			int[] answer = new int[arr.length]; // int타입 answer의 크기는 arr의 배열의 크기
			int tap = 0; // int타입 tap = 0

			// 값이 하나 밖에 없다면
			if (arr.length == 1) {
				answer[0] = -1; // answer는 -1만 리턴
				return answer; // answer 제출 후 프로그램 종료
			} else { // 값이 하나 이상이라면
				answer = new int[(arr.length) - 1]; // answer의 크기는 (arr의 배열의 크기) -1
			}

			for (int i = 0; i < arr.length; i++) { // 전체 배열 반복
				if (arr[tap] <= arr[i]) { // arr의 tap번째 배열이 i번째 배열 이하라면
					tap = tap;
				} else if (arr[tap] > arr[i]) { // arr의 tap번째 배열이 i번째 배열 초과라면
					tap = i;
				}
			}

			for (int i = 0; i < answer.length; i++) { // 전체 배열 반복
				if (i != tap) { // i가 tap값과 일치 하지 않다면
					answer[i] = arr[i]; // answer배열에 값 추가
				} else { // i가 tap값과 일치 하다면
					for (int a = i; a < answer.length; a++) {
						answer[a] = arr[a + 1];
					}
					return answer;
				}
			}
			for (int i = 0; i < answer.length; i++) {
			}
			return answer;
		}
	}
}
