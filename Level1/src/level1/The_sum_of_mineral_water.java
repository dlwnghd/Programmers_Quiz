package level1;

public class The_sum_of_mineral_water {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	            for(int i = 1; i <= n/2; i++){    // int값 i는 1부터; n/2 작거나 같은동안 반복; i++
	        if(n%i == 0) answer += i; // 만약 num나누기i의 나머지가 0이라면 answer = answer + i
	      }
	        return answer+n;    // 정답 제출
	    }

	    // 아래는 테스트로 출력해 보기 위한 코드입니다.
	    // public static void main(String[] args) {
	    //     SumDivisor c = new SumDivisor();
	    //     System.out.println(c.sumDivisor(12));
	    // }
	}
}
