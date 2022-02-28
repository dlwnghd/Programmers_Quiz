package level1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Divided_number_arrangement {
	public static void main(String[] args) {

		class Solution {
			public int[] solution(int[] arr, int divisor) {
				int[] answer = null;
				int count = 0;

				Arrays.sort(arr);

				// 1. �迭������ �ߺ��Ǵ� ���� ����
				ArrayList<Integer> arrayList = new ArrayList<>();

				for (int item : arr) {
					if (!arrayList.contains(item))
						arrayList.add(item);
				}

				// ������ ���� ���� ���� ���ϱ�
				for (int i : arrayList) {
					if (i % divisor == 0) {
						count++;
					}
				}

				// ���� ������ ���� ���� ���� ���
				if (count == 0) {
					answer = new int[1];
					answer[0] = -1;
					return answer;
				} else {
					// answer�� ������ ���� ����ŭ �� ����
					answer = new int[count];
				}

				int k = 0;
				// ������ ���� ������ answer�� �־���
				for (int i = 0; i < count; i++) {
					for (int j = k; j < arr.length; j++) {
						if (arrayList.get(j) % divisor == 0) {
							answer[i] = arrayList.get(j);
							k = j + 1;
							break;
						}
					}
				}

				System.out.println(arrayList);

				return answer;
			}
		}
	}
}
