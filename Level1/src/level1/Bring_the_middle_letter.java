package level1;

public class Bring_the_middle_letter {
	class Solution {
		public String solution(String s) {
			String answer = "";

//	         012345
//	         짝수 길이라면
//	         퍼센트로 할 경우 계산이 너무 오래 걸림
//	         짝수란 2로 나누었을때 나머지(소수점이 나오는 수)가 없는 수

//	         조건문 풀이
			// if((s.length()/2.0) == s.length()/2){
			// answer += s.charAt((s.length()/2)-1);
			// }
			// answer += s.charAt(s.length()/2);
			// return answer;

			// substring(시작위치, 끝나는 위치)를 사용한 풀이
			return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
		}
	}
}
