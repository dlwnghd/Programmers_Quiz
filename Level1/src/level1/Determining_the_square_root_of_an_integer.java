package level1;

public class Determining_the_square_root_of_an_integer {
	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        
	        System.out.println(n);
	        for(long x = 0; x-1 < n; x++){    // x = 1; x�� n�̸����� �ݺ�; x++
	            if(x*x == n){   // n�� ���� ���� x�� �����̶��
	                answer = ((x+1)*(x+1)); // (x+1)�� ������ answer�̴�
	                return answer;  // answer���� ������
	            }
	        }
	        
	        answer = -1;    // answer�� -1�̶�� ����
	        return answer;  // answer���� ������
	    }
	}
}
