package java002_statement;

//2개의 주사위를 던졌을때  합계가 5가 되는 경우의 수를 구하시오.

//(1,4),(2,3),(3,2),(4,1)

public class Java034_for {

	public static void main(String[] args) {
		int count = 0;
		boolean first = true; // 쉼표 처리를 위한 플래그

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 5) {
					if (!first) {
						System.out.print(","); // 첫 번째 요소가 아닐 때만 앞에 쉼표 출력
					}
					System.out.print("(" + i + "," + j + ")");
					count++;
					first = false;
				}
			}
		}
		System.out.println(); // 줄바꿈
		System.out.println("합이 5가 되는 경우의 수: " + count);

	}

}
