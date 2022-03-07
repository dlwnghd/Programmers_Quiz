package kakao;

public class First_Secret_map {
	class Solution {
		public String[] solution(int n, int[] arr1, int[] arr2) {
			// n은 배열의 길이
			// 하나라도 "#"이면 "#" = 1
			// 둘다 " " 이라면 " " = 0
			// 지도 1은 arr1 배열(int)
			// 지도 2는 arr2 배열(int)
			String[] arr1_1 = new String[n];
			String[] arr2_1 = new String[n];
			String[] answer = new String[n];

			// 지도 1
			// 지도1을 10진수를 2진수의 배열로 치완(int to String)
			for (int i = 0; i < n; i++) {
				arr1_1[i] = Integer.toBinaryString(arr1[i]);

				// 만약 10진수의 길이가 n보다 작다면
				if (n - arr1_1[i].length() != 0) {
					int shor = n - arr1_1[i].length();
					// 짧은 길이만큼 0을 추가
					for (int k = 0; k < shor; k++) {
						arr1_1[i] = "0" + arr1_1[i];
					}
				}
				// System.out.println(arr1_1[i]);
			}

			// 지도 2
			// 지도 2를 10진수를 2진수의 배열로 치완(int to String)
			for (int i = 0; i < n; i++) {
				arr2_1[i] = Integer.toBinaryString(arr2[i]);

				// 만약 10진수의 길이가 n보다 작다면
				if (n - arr2_1[i].length() != 0) {
					int shor = n - arr2_1[i].length();
					// 짧은 길이만큼 0을 추가
					for (int k = 0; k < shor; k++) {
						arr2_1[i] = "0" + arr2_1[i];
					}
				}

				// answer에 arr1_1 넣기
				answer = arr1_1;

				// 지도 2의 벽만큼 막기
				for (int j = 0; j < n; j++) {
					// arr2_1[i]번째의 j번째 단어가 '1'이라면
					if (arr2_1[i].charAt(j) == '1') {
						// answer의 [i]번째의 j번째 단어를 변경
						answer[i] = answer[i].substring(0, j) + '1' + answer[i].substring(j + 1, n);
						// System.out.println("answer["+ i +"] : " + answer[i]);
					}
				}

				// 만약 내부에 있는 숫자가 0이라면 " "
				answer[i] = answer[i].replace("0", " ");
				answer[i] = answer[i].replace("1", "#");
			}
			return answer;
		}
	}
}
