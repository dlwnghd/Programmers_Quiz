package level1;

public class Make_a_weird_text {
	class Solution {
		public String solution(String s) {
			String answer = "";
			String[] temp = s.split(" ", -5); // temp는 s의 빈칸들을 출력 배열의 크기를 -1로 고정
			System.out.println("temp = " + temp.length); // 해석을 위해 추가함

			for (int i = 0; i < temp.length; i++) {
				System.out.println("temp : " + temp[i]); // 해석을 위해 추가함
			}

			for (int i = 0; i < temp.length; i++) { // 단어의 수만큼 반복
				for (int j = 0; j < temp[i].length(); j++) { // 단어의 길이만큼 반복

					if (j % 2 == 0) { // 만약 단어의 문자가 짝수번째라면
						if (temp[i].charAt(j) >= 97 && temp[i].charAt(j) <= 122) { // 그 문자가 소문자라면
							answer += (char) (temp[i].charAt(j) - 32); // 소문자 -> 대문자
							System.out.println(answer); // 해석을 위해 추가함
						} else
							answer += temp[i].charAt(j); // 대문자라면 그대로 대입
						System.out.println(answer); // 해석을 위해 추가함

					} else { // 만약 단어의 문자가 홀수번째라면
						if (temp[i].charAt(j) >= 65 && temp[i].charAt(j) <= 90) { // 그 문자가 대문자라면
							answer += (char) (temp[i].charAt(j) + 32); // 대문자 -> 소문자
							System.out.println(answer); // 해석을 위해 추가함
						} else // 소문자라면 그대로 대입
							answer += temp[i].charAt(j);
						System.out.println(answer); // 해석을 위해 추가함

					}
				}
				System.out.println("i : " + i + " / temp.length : " + temp.length); // 해석을 위해 추가함
				if (!(i == temp.length - 1)) // 반복을 다 했는데 남아있는 단어(빈칸 포함)가 있다면? <- 해석이 이상함
					answer += " "; // answer에 " " 추가

			}
			return answer; // 정답 제출
		}
	}
}
