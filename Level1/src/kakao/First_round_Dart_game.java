package kakao;

public class First_round_Dart_game {
	class Solution {
		// 정답의 값은 int타입으로 마지막 계산 실행 후의 값을 넣어주면 된다
		public int solution(String dartResult) {
			int answer = 0, count = 0, j = 0;
			String[] array = new String[3];
			double[] num = new double[3];

			// 나누는 기준은 0번째 String의 값(IndexOF)을 기준으로 숫자가 있을 경우 분리
			// int타입 i는 2부터; dartResult 미만동안; i++
			for (int i = 2; i < dartResult.length(); i++) {
				// 숫자라면
				if (dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57) {
					// 10이라면
					if (dartResult.charAt(i) == 49 && dartResult.charAt(i + 1) == 48) {
						array[count] = dartResult.substring(j, i);
						j = i; // j에 i대입
						count++; // count에 +1
						i++;
						continue;
					}
					// 배열에j부터 i까지의 dartResult에 있는 값을 출력
					array[count] = dartResult.substring(j, i); // 0번째 1번째가 나옴
					j = i; // j에 i대입
					count++; // count에 +1
				}
			}

			// 반복을 돌고 나오고 count가 2이라면
			if (count == 2) { // count가 2이라면

				// 2번째 배열에 나머지 값을 넣어줌
				array[2] = dartResult.substring(j);
			}

			// @@@@보너스
			// 각 기회별로 Single, Double, Tripple로 제곱 계산 (제곱계산하는 방법 찾아봐야함)
			for (int i = 0; i < 3; i++) {
				// 10이라면
				if (array[i].substring(0, 2).equals("10")) {
					if (array[i].indexOf("S") != -1) {
						// double타입의 num[i]에
						num[i] = Math.pow(Integer.parseInt(array[i].substring(0, 2)), 1);
					} else if (array[i].indexOf("D") != -1) { // Double 샷
						num[i] = Math.pow(Double.parseDouble(array[i].substring(0, 2)), 2);
					} else if (array[i].indexOf("T") != -1) { // Triple 샷
						num[i] = Math.pow(Double.parseDouble(array[i].substring(0, 2)), 3);
					}
					continue;
				}

				// Single 샷
				if (array[i].indexOf("S") != -1) {
					// double타입의 num[i]에
					num[i] = Math.pow(Integer.parseInt(array[i].substring(0, 1)), 1);
				} else if (array[i].indexOf("D") != -1) { // Double 샷
					num[i] = Math.pow(Double.parseDouble(array[i].substring(0, 1)), 2);
				} else if (array[i].indexOf("T") != -1) { // Triple 샷
					num[i] = Math.pow(Double.parseDouble(array[i].substring(0, 1)), 3);
				}
			}

			// @@@ 옵션
			// 각 기회에 있는 *, #에 따라 영향을 미침(아스키코드 사용)
			for (int i = 0; i < 3; i++) {
				// 옵션 *
				if (array[i].indexOf("*") != -1) {
					// 0번째 방이라면
					if (i == 0) {
						num[i] = num[i] * 2;
					} else { // 그 외의 방이라면
						num[i] = num[i] * 2;
						num[i - 1] = num[i - 1] * 2;
					}
				} else if (array[i].indexOf("#") != -1) { // 옵션 #
					num[i] = num[i] * (-1);
				}
			}

			for (double i : num) {
				answer += (int) i;
			}

			// 각 기회마다의 계산 후 모든 기회의 값을 합하여 answer에 int타입으로 대입
			return answer;
		}
	}
}
