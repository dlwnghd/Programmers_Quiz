package level1;

public class Addition_of_matrix {
	class Solution {
	    public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr1[0].length];  // int[][]�迭�� answer��� �̸����� ������ �ǵ� = ���ο� int[arr1�� ������ ���� ��ŭ][arr1[]�� ������ ���̸�ŭ]
	        
	        for(int i=0; i < arr1.length; i++) {    // int�� i�� 0; i�� arr1�� �����ͱ��� �̸�����; i++
	            for(int j=0; j < arr1[i].length; j++) { // int�� j�� 0; j�� arr1[]�� �����ͱ��� �̸�����; j++
	                answer[i][j] = arr1[i][j] + arr2[i][j]; // ����
	            }
	        }
	        
	        return answer;  // answer�� ������
	    }
	}
}
