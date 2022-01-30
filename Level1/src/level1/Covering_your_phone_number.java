package level1;

public class Covering_your_phone_number {
	class Solution {
	    public String solution(String phone_number) {
	        String answer = ""; // answer 정의
	        String[] res = phone_number.split("");  // String타입 배열 res이름으로 = phone_number를 번호를 각각 하나씩 저장
	        for(int i=0; i < phone_number.length(); i++) {  // i는0부터; 전화번호 길이까지; i++
	            if(i < (phone_number.length())-4){  // i가 ((phone_number의 길이)-4)미만이라면
	                res[i]="*"; // res[i]는 *모양으로 바꿔줌
	            }
	        }
	        System.out.println(String.join("", res));   // 모든 res배열을 연결하여 출력
	        answer = String.join("", res);  // answer에 모든 res배열을 연결한것을 대입
	        return answer;  // 답 제출
	    }
	}
}
