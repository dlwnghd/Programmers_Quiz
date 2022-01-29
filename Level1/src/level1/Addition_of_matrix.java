package level1;

public class Addition_of_matrix {
	class Solution {
	    public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr1[0].length];  // int[][]배열을 answer라는 이름으로 선언할 건데 = 새로운 int[arr1의 데이터 길이 만큼][arr1[]의 데이터 길이만큼]
	        
	        for(int i=0; i < arr1.length; i++) {    // int값 i는 0; i가 arr1의 데이터길이 미만동안; i++
	            for(int j=0; j < arr1[i].length; j++) { // int값 j는 0; j가 arr1[]의 데이터길이 미만동안; j++
	                answer[i][j] = arr1[i][j] + arr2[i][j]; // 대입
	            }
	        }
	        
	        return answer;  // answer값 돌려줌
	    }
	}
}
