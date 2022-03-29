package complete_search;

public class Mock_test {
	class Solution {
	    public int[] solution(int[] answers) {
	        int[] answer = {};
	        int[] number = {0,1,2,3,4,5};
	        int[] people1 = new int[answers.length];
	        int[] people2 = new int[answers.length];
	        int[] people3 = new int[answers.length];
	        
	        for(int i=0; i < answers.length; i++){
	            // 1번 포기자
	            people1[i] = number[(i%5)+1];
	            System.out.println("people1 : "+people1[i]);
	            
	            if(i%2 == 0){
	                people2[i] = 2;
	            }else{
	                people2[i] = number[(i%5)+1];
	            }
	            System.out.println("people2 : "+people2[i]);
	        }
	        
	        
	        return answer;
	    }
	}
}
