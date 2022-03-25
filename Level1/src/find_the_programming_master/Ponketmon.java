package find_the_programming_master;

import java.util.*;

public class Ponketmon {

	class Solution {
		public int solution(int[] nums) {
			int answer = 0;
			
			// ���ϸ� ������ ��ġ�� �����鼭 �ִ��� ���� ���� �����ϱ⿡
			// �迭�� �ߺ��� ������ �ʴ� HashSet���� ���� ��
			// ���ϸ��� �� / 2 ��ŭ ��� �� �ִ�
			// ���� (���ϸ��� ������ ��)�� (���ϸ��� �� / 2)���� ũ�ٸ� ���ϸ��� �� / 2�� 
			// ���ϸ��� �������� �ִ��� ���� ������ �� �ִ� ���� �ɰ��̰�
			// �ƴ϶�� HashSet�� �ִ� ���ϸ��� ���� ������ �� �ִ� ���ϸ��� ������ ���� �ִ밡 �ɰ��̴�.
			
			Integer b[] = Arrays.stream(nums).boxed().toArray(Integer[]::new);
			Set<Integer> set = new HashSet<>(Arrays.asList(b));

			if (set.size() > nums.length / 2) {
				return nums.length / 2;
			}
			return answer = set.size();
		}
	}
}
