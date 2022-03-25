package find_the_programming_master;

import java.util.*;

public class Ponketmon {

	class Solution {
		public int solution(int[] nums) {
			int answer = 0;
			
			// 폰켓몬에 종류가 겹치지 않으면서 최대한 많은 수를 골라야하기에
			// 배열을 중복이 허용되지 않는 HashSet으로 만든 후
			// 폰켓몬의 수 / 2 만큼 골라갈 수 있다
			// 만약 (폰켓몬의 종류의 수)가 (폰켓몬의 수 / 2)보다 크다면 폰켓몬의 수 / 2가 
			// 폰켓몬을 종류별로 최대한 많이 가져갈 수 있는 수가 될것이고
			// 아니라면 HashSet에 있는 폰켓몬의 수가 가져갈 수 있는 폰켓몬의 종류의 수의 최대가 될것이다.
			
			Integer b[] = Arrays.stream(nums).boxed().toArray(Integer[]::new);
			Set<Integer> set = new HashSet<>(Arrays.asList(b));

			if (set.size() > nums.length / 2) {
				return nums.length / 2;
			}
			return answer = set.size();
		}
	}
}
