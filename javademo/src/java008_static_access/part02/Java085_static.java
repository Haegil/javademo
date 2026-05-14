package java008_static_access.part02;

public class Java085_static {
	public static void main(String[] args) {
		// System.out.println("OrderStatic.y=" + OrderStatic.y);
		// System.out.println("OrderStatic.z=" + OrderStatic.z);
		OrderStatic.process();

		// os.display();
		// OrderStatic os = new OrderStatic();

		// non-static 자원은 static 메서드에서 호출할 수 없다.
		// 메모리에 생성되는 시점이 다르다.
		// cal();
		Java085_static js = new Java085_static();
		js.cal();

	}

	public void cal() {
		System.out.println("cal");
		plus();
	}

	public void plus() {
		System.out.println("plus");
	}

}
