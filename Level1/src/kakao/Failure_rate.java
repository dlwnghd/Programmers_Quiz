package kakao;

import java.util.*;

public class Failure_rate {
	class Solution {
	    public int[] solution(int N, int[] stages) {
	        // 정답의 배열의 길이는 스테이지 수만큼
	        int[] answer = new int[N];
	        // double타입의 users는 플레이어의 수만큼
	        double users =stages.length;
	        // 리스트타입의 double타입배열 fail_rate를 선언
	        List<double[]> fail_rate = new ArrayList<>();
	        
	        // int타입의 cnt를 선언
	        int cnt=0;
	        
	        // int i는 1부터 스테이지의수까지 1씩 증가하여 반복
	        for(int i=1;i<=N;i++){
	            // int j는 0부터 플레이어의수까지 1씩 증가하여 반복
	            for(int j=0;j<stages.length;j++){
	                // 만약 스테이지와 그 스테이지에 머물고있는 플레이어라면
	                if(i==stages[j]){
	                    // cnt + 1
	                    cnt++;
	                }
	            }
	            // 만약 cnt가 0이라면 : 그 스테이지의 실패한 사람이 없다면
	           if(cnt==0){
	               // 실패율에 0을 줌
	              fail_rate.add(new double[]{i,0});
	              continue;
	           }
	            // 실패율을 계산하여 줌
	          fail_rate.add(new double[]{i,cnt/users});
	            // users에 실패한 플레이어의 수만큼 빼줌
	          users-=cnt;
	            // cnt는 다시 0
	          cnt=0;
	        }
	        
	        //한 줄로도 쓸수가있다!
	        fail_rate.sort((a,b)->Double.compare(b[1],a[1]));
	        
	        // int타입 i는 0부터 fail_rate의 크기만큼 1씩 증가하여 반복
	        for(int i=0;i<fail_rate.size();i++){
	            // answer[i]번째는 fail_rate의 i번째배열의 0번방?
	            answer[i]=(int)fail_rate.get(i)[0];
	        }
	        
	        return answer;
	    }
	}
}
