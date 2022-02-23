package level1;

public class The_number_of_p_and_y_in_the_string {
	public static void main(String[] args) {
		class Solution {
			boolean solution(String s) {
				boolean answer = true;
				// 1.'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False
				// 2.'p','y'모두 하나도 없는 경우는 항상 True
				// 3. 갯수를 비교할 때 대문자와 소문자를 구별하지 않음

				// 문장의 길이 만큼 char타입 배열 생성
				char[] sentence = new char[s.length()];

				// 갯수를 세주는 int타입 count생성
				int pCount = 0, yCount = 0;

				// 배열에 문장의 단어 하나하나 넣기
				for (int i = 0; i < s.length(); i++) {
					sentence[i] = s.charAt(i);
				}

				// 문장에서 p와 y찾기
				for (int i = 0; i < s.length(); i++) {
					// 80(P), 112(p)
					// char타입이기 때문에 .equals()메소드는 사용이 불가함
					if (sentence[i] == 'P' || sentence[i] == 'p') {
						pCount++;
					} else if (sentence[i] == 'Y' || sentence[i] == 'y') { // 89(Y), 121(y)
						yCount++;
					}
				}

				// p의 갯수와 y의 갯수를 비교
				if (pCount == yCount) {
					answer = true;
				} else if (pCount == 0 && yCount == 0) {
					answer = true;
				} else {
					answer = false;
				}

				return answer;
			}
		}
	}
}
