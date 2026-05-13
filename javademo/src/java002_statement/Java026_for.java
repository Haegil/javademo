package java002_statement;

public class Java026_for {

	public static void main(String[] args) {
		// 누적값이 최초로 15이상일때까지만 반복문을 수행

		int sum = 0;
		int i;

		for (i = 1;; i++) {
			sum = sum + i;
			if (15 <= sum) {
				break;
			}
		}

		System.out.printf("i=%d, sum=%d\n", i, sum);
	}

}
