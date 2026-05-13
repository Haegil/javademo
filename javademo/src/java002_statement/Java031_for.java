package java002_statement;

public class Java031_for {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			// 3의 배수가 아닌 경우에만 출력
			if (i % 3 != 0) {
				System.out.println(i);
			}
		}

	}

}
