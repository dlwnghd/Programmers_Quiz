package monthlyCodeChallenge;

import java.util.*;

public class Triad_flip {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        // StackŸ�� Integer stack�� ���� ����
	        Stack<Integer> stack = new Stack<Integer>();

	        // intŸ�� count�� 0
	        int count = 0;

	        // ���ѹݺ�
	        while(true){
	            //count ����
	            count++;
	            // stack�� n���� ���� ������ 0 �Ǵ� 1 �Ǵ� 2�� �߰�
	            stack.add(n%3);
	            // n�� n / 3
	            n = n / 3;
	            // ���� n�� 0�̶�� ����
	            if(n == 0)break;
	        }
	        
	        // i�� count�� ����ŭ �ݺ�
	        for(int i=0; i<count; i++){
	            // answer�� stack���� ���ڸ� ���鼭 �� ���� 3�� i���� ���� ���� �߰�
	            answer += stack.pop() * (Math.pow(3,i));
	        }
	        
	        // �� ����
	        return answer;
	    }
	}
}
