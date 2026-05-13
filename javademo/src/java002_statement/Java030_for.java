package java002_statement;

public class Java030_for {

	public static void main(String[] args) {
		int odd = 0; // 홀수 합계
		int even = 0; // 짝수 합계

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even += i; // 짝수인 경우
			} else {
				odd += i; // 홀수인 경우
			}
		}

		System.out.println("홀수누적:" + odd);
		System.out.println("짝수누적:" + even);
	}
}
