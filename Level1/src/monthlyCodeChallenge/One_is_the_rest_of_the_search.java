package monthlyCodeChallenge;

public class One_is_the_rest_of_the_search {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        for(int i = 1; i < n; i++){
	            if(n%i == 1){
	                answer = i;
	                break;
	            }
	        }
	        
	        return answer;
	    }
	}
}
