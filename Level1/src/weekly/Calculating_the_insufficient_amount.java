package weekly;

public class Calculating_the_insufficient_amount {
	class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = -1;
	        // �̿�ݾ��� ��
	        long totalPrice = 0;
	        
	        for(int n = 1; n <= count; n++){
	            // �̿�ݾ��� �� ���
	            totalPrice += price*n;
	        }
	        
	        // ���� = �̿�ݾ��� �� - �ڽ��� ������ �ִ� �ݾ�
	        // �ݾ��� �������� ������
	        if(totalPrice <= money){    // totalPrice�� money ���϶��
	            // 0 return
	            answer = 0;
	        }else{  // ������
	            answer = totalPrice - money;
	        }
	        
	        return answer;
	    }
	}
}
