package array;

import java.util.ArrayList;
import java.util.Collections;

public class Kth_number {
	class Solution {
		public int[] solution(int[] array, int[][] commands) {
			int[] answer = new int[commands.length];

			// Ŀ�ǵ��� ���̸�ŭ �ݺ�
			for (int i = 0; i < commands.length; i++) { // i = 0,1,2
				// �迭�� ���̸� �𸣱� ������ list�� ����
				ArrayList<Integer> list = new ArrayList<Integer>();

				// ����Ʈ�� i��° ���ں��� j��° ���ڱ��� �־���
				for (int j = commands[i][0]; j <= commands[i][1]; j++) { // j = 5,4,7
					// ����Ʈ�� array�� j-1��° �� ���� �߰�
					list.add(array[j - 1]);
				}

				// ����Ʈ �����ϱ�
				Collections.sort(list);

				// k��° �� answer�� �߰��ϱ�
				answer[i] = list.get(commands[i][2] - 1);
			}

			return answer;
		}
	}
}
