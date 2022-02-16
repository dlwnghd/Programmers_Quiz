package level1;

public class Caesar_s_code {
	public static void main(String[] args) {
		class Solution {
		    public String solution(String s, int n) {
		        String answer = "";
		        char[] array = new char[s.length()];
		        
		        for(int i = 0; i < s.length(); i++){
		            array[i] = s.charAt(i);
		        }
		        
		        for(int i = 0; i < s.length(); i++){
		            // 빈칸이라면
		            if(array[i] == ' ') array[i] = ' ';
		            // z를 넘어가면
		            else if((char)(array[i] + n) > 122) array[i] = (char)(array[i] + n-26);
		            // Z를 넘어가면
		            else if(array[i] > 64 && array[i] < 91 && (char)(array[i] + n) > 90){
		                array[i] = (char)(array[i] + n-26);
		            }
		            else array[i] = (char)(array[i] + n);
		        }
		        answer = String.valueOf(array);
		        
		        return answer;
		    }
		}
	}
}
