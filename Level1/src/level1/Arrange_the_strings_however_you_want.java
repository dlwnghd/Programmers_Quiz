package level1;

public class Arrange_the_strings_however_you_want {
	class Solution {
		public String[] solution(String[] strings, int n) {

			String temp = "";
			for (int i = 0; i < strings.length - 1; i++) {
				for (int j = i + 1; j < strings.length; j++) {
					// 만약 n번째 단어가 다음 문자의 n번째 단어보다 크다면
					if (strings[i].charAt(n) > strings[j].charAt(n)) {
						// 두 단어의 위치를 바꾸어 줌
						// temp라는 문자열에 strings[j] 번째 문자를 넣고
						temp = strings[j];
						// strings[j] 번째에 strings[i]번째 문자를 넣고
						strings[j] = strings[i];
						// strings[i]]번째에 trmp를 넣는다
						strings[i] = temp;
					} else if (strings[i].charAt(n) == strings[j].charAt(n)) { // 만약 n번째 단어가 다음 문자의 n번째 단어와 같다면
						// 두 단어의 n번째 단어가 같다면

						// strings의[i]번째 단어가 strings[j]단어와 비교했을 때 사전적으로 더 앞선 단어라면
						if (strings[i].compareTo(strings[j]) > 0) {
							// 두 단어의 위치를 바꾸어줌

							// temp에 strings의 j번째 값 대입
							temp = strings[j];
							// strings의 [j]번째 방에 strings[i]번째 값을 대입
							strings[j] = strings[i];
							// strings의 [i]번째 방에는 temp 값을 대입
							strings[i] = temp;
						}
					}
				}
			}

			return strings;
		}
	}
}
