package java010_abstract_interface.part03;

// extends (class 이름) implements (interface 이름), (interface 이름), (interface 이름)
public class Life extends Animal implements SampleA, SampleB {

	public Life() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call");
	}

	@Override
	public void prn() {
		// TODO Auto-generated method stub
		System.out.println("prn");
	}

}
