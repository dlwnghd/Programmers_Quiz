package level1;

import java.util.Arrays; // 배열 메소드를 사용하기 위한 import

public class Flip_the_natural_tree_and_make_it_into_an_arrangement {
	class Solution {
		public int[] solution(long n) {
			String s = String.valueOf(n); // n에 들어있는 long값을 String타입 s로 변환
			int[] answer = new int[s.length()]; // int타입 배열 answer의 길이를 지정
			String[] a = s.split(""); // s에 들어있는 문자열을 하나하나 분리하여 String타입 배열 a에 대입
			int j = (s.length()) - 1;

			for (int i = 0; i < s.length(); i++) {
				answer[i] = Integer.parseInt(a[j]);
				j--;
			}
			return answer;
		}
	}
}