package level1;

public class Covering_your_phone_number {
	class Solution {
	    public String solution(String phone_number) {
	        String answer = ""; // answer ����
	        String[] res = phone_number.split("");  // StringŸ�� �迭 res�̸����� = phone_number�� ��ȣ�� ���� �ϳ��� ����
	        for(int i=0; i < phone_number.length(); i++) {  // i��0����; ��ȭ��ȣ ���̱���; i++
	            if(i < (phone_number.length())-4){  // i�� ((phone_number�� ����)-4)�̸��̶��
	                res[i]="*"; // res[i]�� *������� �ٲ���
	            }
	        }
	        System.out.println(String.join("", res));   // ��� res�迭�� �����Ͽ� ���
	        answer = String.join("", res);  // answer�� ��� res�迭�� �����Ѱ��� ����
	        return answer;  // �� ����
	    }
	}
}
