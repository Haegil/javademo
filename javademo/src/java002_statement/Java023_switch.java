package java002_statement;

public class Java023_switch {

	public static void main(String[] args) {

		String color = "blue";

		switch (color) {
		case "red":
			System.out.println("ff0000"); // #red green blue
			break;
		case "green":
			System.out.println("00ff00");
			break;
		case "blue":
			System.out.println("0000ff");
			break;
		case "white":
			System.out.println("ffffff");
			break;
		case "black":
			System.out.println("000000");
			break;
		}

	}
}
