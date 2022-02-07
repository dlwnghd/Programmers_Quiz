package level1;

public class Determining_the_square_root_of_an_integer {
	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        
	        System.out.println(n);
	        for(long x = 0; x-1 < n; x++){    // x = 1; x가 n미만동안 반복; x++
	            if(x*x == n){   // n이 양의 정수 x의 제곱이라면
	                answer = ((x+1)*(x+1)); // (x+1)의 제곱은 answer이다
	                return answer;  // answer값을 돌려줌
	            }
	        }
	        
	        answer = -1;    // answer는 -1이라고 정의
	        return answer;  // answer값을 돌려줌
	    }
	}
}
