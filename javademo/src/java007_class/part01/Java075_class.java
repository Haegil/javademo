package java007_class.part01;

public class Java075_class {
	public static void main(String[] args) {
//		Goods g1 = new Goods("Nikon", 40000, 30, 50);
//		System.out.println(g1.toString());
//
//		Goods g2 = new Goods("Sony", 45000, 20, 35);
//		System.out.println(g2.toString());
//
//		Goods g3 = new Goods("Fujifilm", 35000, 10, 25);
//		System.out.println(g3.toString());

		Goods[] goods = { new Goods("Nikon", 40000, 30, 50), new Goods("Sony", 45000, 20, 35),
				new Goods("Fujifilm", 35000, 10, 25) };

		for (Goods item : goods) {
			System.out.println(item.toString());
		}
	}
}
