package java009_inheritance.part03;

public class SubConst extends SuperConst {

	public SubConst(int x, int y) {
		super(x, y);
	}

	@Override
	public String toString() {
		return String.format("x=%d, y=%d", x, y);
	}

	public void display() {
		System.out.println(super.toString());
		System.out.println(toString());
	}
}
