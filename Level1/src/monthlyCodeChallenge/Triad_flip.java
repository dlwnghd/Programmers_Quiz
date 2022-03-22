package monthlyCodeChallenge;

import java.util.*;

public class Triad_flip {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        // Stack타입 Integer stack을 새로 선언
	        Stack<Integer> stack = new Stack<Integer>();

	        // int타입 count는 0
	        int count = 0;

	        // 무한반복
	        while(true){
	            //count 증가
	            count++;
	            // stack에 n으로 나눈 나머지 0 또는 1 또는 2를 추가
	            stack.add(n%3);
	            // n은 n / 3
	            n = n / 3;
	            // 만약 n이 0이라면 종료
	            if(n == 0)break;
	        }
	        
	        // i는 count의 수만큼 반복
	        for(int i=0; i<count; i++){
	            // answer는 stack에서 숫자를 빼면서 그 값에 3의 i승을 곱한 값을 추가
	            answer += stack.pop() * (Math.pow(3,i));
	        }
	        
	        // 답 제출
	        return answer;
	    }
	}
}
