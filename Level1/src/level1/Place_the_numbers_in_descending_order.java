package level1;

import java.util.Arrays;    // 배열 메소드를 사용하기 위한 import
import java.util.Collections;   // Collections클래스 내의 메소드를 사용하기 위한 호출

public class Place_the_numbers_in_descending_order {
	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        String s = String.valueOf(n);   // n에 들어있는 long값을 String타입으로 변환
	        String[] a = s.split("");   // s에 들어있는 문자열을 하나하나 분리하여 String타입 배열 a에 대입
	        
	        Arrays.sort(a, Collections.reverseOrder()); // a에 들어있는 배열을 내림차순으로 정열
	        
	        String res = String.join("",a); // String타입 res에 a에 들어있는 배열을 연결하여 대입
	        answer = Long.parseLong(res);   // res에 들어있는 String타입의 값을 Long타입으로 변환하여 answer에 정의
	        return answer;  // answer 제출
	    }
	}
}
