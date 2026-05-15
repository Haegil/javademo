package java020_thread.part01;

// 프로세스: 집
// 스레드: 가족구성원
// 공유자원: 욕실(Washroom)

public class Java215_Thread {
	public static void main(String[] args) {
		Washroom wr = new Washroom();

		FamilyThread father = new FamilyThread(wr, "father");
		FamilyThread mother = new FamilyThread(wr, "mother");
		FamilyThread sister = new FamilyThread(wr, "sister");
		FamilyThread brother = new FamilyThread(wr, "brother");

		father.start();
		mother.start();
		sister.start();
		brother.start();
	}
}
