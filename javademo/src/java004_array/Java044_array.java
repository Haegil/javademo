package java004_array;

public class Java044_array {
	public static void main(String[] args) {
		char[] data = new char[] { 'a', 'b', 'F', 'R', 'a' };
		int count = 0;

		// 향상된 for문을 사용하여 배열 순회
		for (char ch : data) {
			// 해당 문자가 대문자인지 확인
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}

		System.out.println("[출력결과]\n대문자 개수: " + count);
	}
}
