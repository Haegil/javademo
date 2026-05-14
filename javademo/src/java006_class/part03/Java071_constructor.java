package java006_class.part03;

public class Java071_constructor {
	public static void main(String[] args) {
		HandPhone hp = new HandPhone();
		hp.name = "John";
		hp.number = "010-1234-5678";
		hp.display();

		HandPhone hp2 = new HandPhone("Jane", "010-0987-6543");
		hp2.display();
	}
}
