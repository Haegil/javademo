package java004_array;

// [데이터]
// 홍길동 90 85 40
// 이영희 100 35 75

//[출력결과]
//홍길동 90 85 40 215 71.7
//이영희 100 35 75 210 70.0

public class Java047_array {
	public static void main(String[] args) {
		// 2차원 배열 데이터 초기화 (이름, 과목1, 과목2, 과목3)
		String[][] studentData = { { "홍길동", "90", "85", "40" }, { "이영희", "100", "35", "75" } };

		System.out.println("[출력결과]");

		for (String[] row : studentData) {
			String name = row[0];
			int score1 = Integer.parseInt(row[1]);
			int score2 = Integer.parseInt(row[2]);
			int score3 = Integer.parseInt(row[3]);

			// 총점 계산
			int total = score1 + score2 + score3;

			// 평균 계산
			double average = total / 3.0;

			// 출력 형식: 이름 과목1 과목2 과목3 총점 평균
			System.out.printf("%s %d %d %d %d %.1f\n", name, score1, score2, score3, total, average);
		}
	}
}
