package java002_statement;

//1   2   3   4
//5   6   7   8
//9  10  11  12

public class Java032_for {

	public static void main(String[] args) {

		for (int i = 1; i <= 12; i++) {
			System.out.printf("%4d", i);

			// 4의 배수일 때마다 줄바꿈 (4열 기준)
			if (i % 4 == 0) {
				System.out.println();
			}
		}
	}

}
