package level1;

public class Year_of_2016 {
	class Solution {
		public String solution(int a, int b) {
			String answer = "";
			String[] arrDay = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
			int day = 0;
			// 0, 1, 2, 3, 4, 5, 6
			// 월, 화, 수, 목, 금, 토, 일

			// 1 금요일 시작
			// 2 월요일 시작
			// 3 화요일 시작
			// 4 금요일 시작
			// 5 일요일 시작
			// 6 수요일 시작
			// 7 금요일 시작
			// 8 월요일 시작
			// 9 목요일 시작
			// 10 토요일 시작
			// 11 화요일 시작
			// 12 목요일 시작
			switch (a) {
			// 월요일
			case 2, 8:
				day = 0;
				break;
			// 화요일
			case 3, 11:
				day = 1;
				break;
			// 수요일
			case 6:// 5
				day = 2;
				break;
			// 목요일
			case 9, 12:
				day = 3;
				break;
			// 금요일
			case 1, 4, 7:
				day = 4;
				break;
			// 토요일
			case 10:
				day = 5;
				break;
			// 일요일
			case 5:
				day = 6;
				break;
			}
			day = (day + b) % 7;
			answer = arrDay[day];

			return answer;
		}
	}
}
