package level1;

import java.util.Arrays;    // �迭 �޼ҵ带 ����ϱ� ���� import
import java.util.Collections;   // CollectionsŬ���� ���� �޼ҵ带 ����ϱ� ���� ȣ��

public class Place_the_numbers_in_descending_order {
	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        String s = String.valueOf(n);   // n�� ����ִ� long���� StringŸ������ ��ȯ
	        String[] a = s.split("");   // s�� ����ִ� ���ڿ��� �ϳ��ϳ� �и��Ͽ� StringŸ�� �迭 a�� ����
	        
	        Arrays.sort(a, Collections.reverseOrder()); // a�� ����ִ� �迭�� ������������ ����
	        
	        String res = String.join("",a); // StringŸ�� res�� a�� ����ִ� �迭�� �����Ͽ� ����
	        answer = Long.parseLong(res);   // res�� ����ִ� StringŸ���� ���� LongŸ������ ��ȯ�Ͽ� answer�� ����
	        return answer;  // answer ����
	    }
	}
}