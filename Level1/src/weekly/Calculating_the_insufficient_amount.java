package weekly;

public class Calculating_the_insufficient_amount {
	class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = -1;
	        // 이용금액의 합
	        long totalPrice = 0;
	        
	        for(int n = 1; n <= count; n++){
	            // 이용금액의 합 계산
	            totalPrice += price*n;
	        }
	        
	        // 정답 = 이용금액의 합 - 자신이 가지고 있는 금액
	        // 금액이 부족하지 않으면
	        if(totalPrice <= money){    // totalPrice가 money 이하라면
	            // 0 return
	            answer = 0;
	        }else{  // 나머지
	            answer = totalPrice - money;
	        }
	        
	        return answer;
	    }
	}
}
