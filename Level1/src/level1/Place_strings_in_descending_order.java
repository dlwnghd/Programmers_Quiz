package level1;

import java.util.Arrays; // 나중에 혼자서 알고리즘 만들 줄 알아야함

public class Place_strings_in_descending_order {
	public static void main(String[] args) {

		class Solution {
			public String solution(String s) {
				String answer = "";
				boolean check = false;

				// String -> char[] -> 문자화
				char[] array1 = new char[s.length()];
				for (int i = 0; i < s.length(); i++) {
					array1[i] = s.charAt(i);
				}

				int[] arrayLarge = new int[s.length()];
				int[] arraySmall = new int[s.length()];

				// char[] -> int
				for (int i = 0; i < s.length(); i++) {
					if ((int) (array1[i]) < 91) {
						check = false;
					} else {
						check = true;
					}
					// 소문자 숫자화
					if (check == true) {
						arraySmall[i] = (int) (array1[i]);
					} else {
						// 대문자 숫자화
						arrayLarge[i] = (int) (array1[i]);
					}
				}

				// 정렬
				Arrays.sort(arraySmall);
				Arrays.sort(arrayLarge);

				// int[] -> char[] -> 문자화
				// String + char = String -> 문자열화
				for (int i = arraySmall.length - 1; i >= 0; i--) {
					if (arraySmall[i] == 0) {
						continue;
					}
					answer += (char) arraySmall[i];
				}
				for (int i = arrayLarge.length - 1; i >= 0; i--) {
					if (arrayLarge[i] == 0) {
						continue;
					}
					answer += (char) (arrayLarge[i]);
				}
				return answer;
			}
		}
	}
}
