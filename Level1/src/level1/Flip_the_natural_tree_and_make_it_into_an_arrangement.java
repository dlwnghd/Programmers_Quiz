package level1;

import java.util.Arrays; // �迭 �޼ҵ带 ����ϱ� ���� import

public class Flip_the_natural_tree_and_make_it_into_an_arrangement {
	class Solution {
		public int[] solution(long n) {
			String s = String.valueOf(n); // n�� ����ִ� long���� StringŸ�� s�� ��ȯ
			int[] answer = new int[s.length()]; // intŸ�� �迭 answer�� ���̸� ����
			String[] a = s.split(""); // s�� ����ִ� ���ڿ��� �ϳ��ϳ� �и��Ͽ� StringŸ�� �迭 a�� ����
			int j = (s.length()) - 1;

			for (int i = 0; i < s.length(); i++) {
				answer[i] = Integer.parseInt(a[j]);
				j--;
			}
			return answer;
		}
	}
}