package level1;

public class The_sum_of_mineral_water {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	            for(int i = 1; i <= n/2; i++){    // int�� i�� 1����; n/2 �۰ų� �������� �ݺ�; i++
	        if(n%i == 0) answer += i; // ���� num������i�� �������� 0�̶�� answer = answer + i
	      }
	        return answer+n;    // ���� ����
	    }

	    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	    // public static void main(String[] args) {
	    //     SumDivisor c = new SumDivisor();
	    //     System.out.println(c.sumDivisor(12));
	    // }
	}
}
