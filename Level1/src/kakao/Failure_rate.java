package kakao;

import java.util.*;

public class Failure_rate {
	class Solution {
	    public int[] solution(int N, int[] stages) {
	        // ������ �迭�� ���̴� �������� ����ŭ
	        int[] answer = new int[N];
	        // doubleŸ���� users�� �÷��̾��� ����ŭ
	        double users =stages.length;
	        // ����ƮŸ���� doubleŸ�Թ迭 fail_rate�� ����
	        List<double[]> fail_rate = new ArrayList<>();
	        
	        // intŸ���� cnt�� ����
	        int cnt=0;
	        
	        // int i�� 1���� ���������Ǽ����� 1�� �����Ͽ� �ݺ�
	        for(int i=1;i<=N;i++){
	            // int j�� 0���� �÷��̾��Ǽ����� 1�� �����Ͽ� �ݺ�
	            for(int j=0;j<stages.length;j++){
	                // ���� ���������� �� ���������� �ӹ����ִ� �÷��̾���
	                if(i==stages[j]){
	                    // cnt + 1
	                    cnt++;
	                }
	            }
	            // ���� cnt�� 0�̶�� : �� ���������� ������ ����� ���ٸ�
	           if(cnt==0){
	               // �������� 0�� ��
	              fail_rate.add(new double[]{i,0});
	              continue;
	           }
	            // �������� ����Ͽ� ��
	          fail_rate.add(new double[]{i,cnt/users});
	            // users�� ������ �÷��̾��� ����ŭ ����
	          users-=cnt;
	            // cnt�� �ٽ� 0
	          cnt=0;
	        }
	        
	        //�� �ٷε� �������ִ�!
	        fail_rate.sort((a,b)->Double.compare(b[1],a[1]));
	        
	        // intŸ�� i�� 0���� fail_rate�� ũ�⸸ŭ 1�� �����Ͽ� �ݺ�
	        for(int i=0;i<fail_rate.size();i++){
	            // answer[i]��°�� fail_rate�� i��°�迭�� 0����?
	            answer[i]=(int)fail_rate.get(i)[0];
	        }
	        
	        return answer;
	    }
	}
}
