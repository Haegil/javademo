package java002_statement;

//i=1
//i=2
//i=3
//i=4
//i=5
//sum=15

public class Java028_for {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1;; i++) {
			sum = sum + i;

			if (15 <= sum) {
				break;
			}

			System.out.printf("i=%d\n", i);
		}

		System.out.printf("sum=%d\n", sum);
	}
}
