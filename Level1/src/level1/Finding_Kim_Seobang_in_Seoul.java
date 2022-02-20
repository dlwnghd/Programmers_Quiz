package level1;

public class Finding_Kim_Seobang_in_Seoul {
	public static void main(String[] args) {
		class Solution {
			public String solution(String[] seoul) {
				// String타입 정의문
				String answer = "", kim = "김서방은 ", exist = "에 있다";

				// int타입 i가 0; seoul.length길이 미만동안 반복; i++
				for (int i = 0; i < seoul.length; i++) {
					// seoul[i]가 "Kim"이라는 값과 일치한다면
					if (seoul[i].equals("Kim")) {
						// answer 정의
						answer = kim + i + exist;
						// 반복문 탈출
						break;
					}
				}
				// 정답 제출
				return answer;
			}
		}
	}
}
