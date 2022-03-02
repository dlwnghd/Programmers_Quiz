package kakao;

public class First_round_Dart_game {
	class Solution {
		// 정답의 값은 int타입으로 마지막 계산 실행 후의 값을 넣어주면 된다
		public int solution(String dartResult) {
			int answer = 0;

			// String타입으로 한 플레이어의 전체 기록을 받아옴
			// 변칙적으로 나오는 값은 # ,*
			// String값으로 받은 값들을 3번의 기회로 나눔
			// 나누는 기준은 2번째 String의 값(IndexOF)을 기준으로 숫자가 있을 경우 분리
			// 각 기회별로 Single, Double, Tripple로 제곱 계산 (제곱계산하는 방법 찾아봐야함)
			// 각 기회에 있는 *, #에 따라 영향을 미침(아스키코드 사용)
			// 각 기회마다의 계산 후 모든 기회의 값을 합하여 answer에 int타입으로 대입
			return answer;
		}
	}
}
