package level1;

import java.util.*;
import java.util.LinkedList; // LinkedList�� ����ϱ� ���� java���� import

public class Add_digits {
	public class Solution {
		public int solution(int n) {
			int answer = 0;
			LinkedList<Integer> stack = new LinkedList<Integer>(); // LinkedList�� IntegerŸ���� stack��ü�� ���� ����
			while (n > 0) { // �־��� n�� 0���� Ŭ�� ���� �ݺ�
				stack.push(n % 10); // stack��ü�� push�޼ҵ带 ���� ���� ���� stack�� ����
				n = n / 10; // n / 10�� ���� �ڸ��� �̵�
			}
			while ((!stack.isEmpty())) { // stack�� ���� ������� ���� ���� �ݺ�
				answer += stack.pop(); // answer = answer + stack���� ���ڸ� �����ͼ� ������(���� �����ʹ� ���� )
			}
			return answer; // �� ����
		}
	}
}