package java002_statement;

public class Java035_for {
	public static void main(String[] args) {
		go: // label
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("j=%d\n", j);
				if (j == 3) {
					continue go; // for문에서 continue ${label}을 만나면 해당 라벨이 설정된 반복문으로 감
				}
			}
		}
	}
}
