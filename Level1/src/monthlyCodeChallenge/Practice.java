package monthlyCodeChallenge;

import java.util.*;

public class Practice {

	class Solution {
		public int[] solution(int[] numbers) {

			List<Integer> testList = new ArrayList<Integer>();

			for (int a = 0; a < numbers.length; a++) {
				// System.out.println("a: "+a);
				for (int b = 0; b < numbers.length - 1; b++) {
					// System.out.println("b: "+b);

					// ���� ���� ������ �ʱ� ����
					// ���� �迭�� �ּҸ� ������ ��� ���� �� ������� �Ѿ
					if (a == b)
						continue;

					// a+b���� testList�ȿ� �����Ѵٸ�
					if (testList.contains(numbers[a] + numbers[b]))
						continue;

					testList.add(numbers[a] + numbers[b]);
					// System.out.println(testList);
				}
			}
			Collections.sort(testList);
			// System.out.println(testList);

			int[] answer = new int[testList.size()];
			for (int i = 0; i < testList.size(); i++) {
				answer[i] = testList.get(i);
			}

			return answer;
		}

	}
}
