package hash;

import java.util.*;

public class An_incomplete_runner {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";

	        Arrays.sort(participant);
	        Arrays.sort(completion);

	        if(participant.length == completion.length) {
	                return "";
	            }
	        
	        for(int i=0; i<participant.length; i++) {
	            if(i == completion.length) {
	                answer = participant[i];
	                break;
	            }
	            if(!participant[i].equals(completion[i])) {
	                answer = participant[i];
	                break;
	            }
	        }

	        return answer;
	    }
	}
}
