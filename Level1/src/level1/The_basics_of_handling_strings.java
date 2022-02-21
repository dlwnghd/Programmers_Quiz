package level1;

public class The_basics_of_handling_strings {
	public static void main(String[] args) {
		class Solution {
			public boolean solution(String s) {
				boolean answer = true;
				char[] array = s.toCharArray();

				for (int i = 0; i < s.length(); i++) {
					if (array.length != 4 && array.length != 6) {
						answer = false;
						break;
					}
					if (!((int) (array[i]) > 47 && (int) (array[i]) < 58)) {
						answer = false;
						break;
					}
				}
				return answer;
			}
		}
	}
}
