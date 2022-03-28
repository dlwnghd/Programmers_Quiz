package greedy;

import java.util.*;

public class Workout_clothes {

	class Solution {
		public int solution(int n, int[] lost, int[] reserve) {
			
			// 모두 체육복이 있다고 가정
			// 체육복이 사라진 만큼 -
			// 여가 체육복의 수만큼 +
			// 2개를 가지고 있다면
			// 1. 밑에 친구가 0개라면 주기
			// 2. 위에 친구가 0개라면 주기
			// check의 1번째 방부터 30번째 방까지의 check갯수 만큼이
			// 최대한 많은 양의 수를 준 갯수
			
			
			// int타입 answer
			int answer = 0;
			// int타입 배열 check는 100칸
			int[] check = new int[100];

			// check배열에 있는 값을 전부 1로 가득 채움
			Arrays.fill(check, 1);

			// 0부터 reserve의 길이만큼 반복
			for (int i = 0; i < reserve.length; i++) {
				// check의 (reserve의 i번째 값)번째 방에 +1
				check[reserve[i]]++;
			}

			// 0부터 lost의 길이만큼 반복
			for (int i = 0; i < lost.length; i++) {
				// check의 (lost의 i번째 값)번째 방에 +1
				check[lost[i]]--;
			}

			// 1부터 n을 포함한 곳 까지 반복
			for (int i = 1; i <= n; i++) {
				// check의 i번째가 2이고 check[i-1]번째가 0이라면
				if (check[i] == 2 && check[i - 1] == 0) {
					// check의 i번째는 -1
					check[i]--;
					// check의 i-1번째에 +1
					check[i - 1]++;
				}
				// check의 i번째가 2이고 check[i+1]번째가 0이라면
				if (check[i] == 2 && check[i + 1] == 0) {
					// check의 i번째가 2이고 check[i-1]번째가 0이라면
					check[i]--;
					// check의 i+1번째에 +1
					check[i + 1]++;
				}
			}

			// 1부터 n을 포함한 곳 까지 반복
			for (int i = 1; i <= n; i++) {
				// check[i]번째가 1보다 크거나 같다면 answer +1
				if (check[i] >= 1)
					answer++;
			}

			return answer;
		}
	}
}
