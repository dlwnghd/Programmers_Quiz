package level1;

import java.util.*;
import java.util.LinkedList; // LinkedList를 사용하기 위해 java에서 import

public class Add_digits {
	public class Solution {
		public int solution(int n) {
			int answer = 0;
			LinkedList<Integer> stack = new LinkedList<Integer>(); // LinkedList를 Integer타입의 stack객체로 새로 만듬
			while (n > 0) { // 주어진 n이 0보다 클때 동안 반복
				stack.push(n % 10); // stack객체의 push메소드를 통해 나온 값을 stack에 저장
				n = n / 10; // n / 10을 통해 자릿수 이동
			}
			while ((!stack.isEmpty())) { // stack의 값이 비어있지 않은 동안 반복
				answer += stack.pop(); // answer = answer + stack에서 숫자를 꺼내와서 더해줌(꺼낸 데이터는 삭제 )
			}
			return answer; // 답 제출
		}
	}
}
