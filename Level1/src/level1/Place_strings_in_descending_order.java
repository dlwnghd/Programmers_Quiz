package level1;

import java.util.Arrays; // ���߿� ȥ�ڼ� �˰��� ���� �� �˾ƾ���

public class Place_strings_in_descending_order {
	public static void main(String[] args) {

		class Solution {
			public String solution(String s) {
				String answer = "";
				boolean check = false;

				// String -> char[] -> ����ȭ
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
					// �ҹ��� ����ȭ
					if (check == true) {
						arraySmall[i] = (int) (array1[i]);
					} else {
						// �빮�� ����ȭ
						arrayLarge[i] = (int) (array1[i]);
					}
				}

				// ����
				Arrays.sort(arraySmall);
				Arrays.sort(arrayLarge);

				// int[] -> char[] -> ����ȭ
				// String + char = String -> ���ڿ�ȭ
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
