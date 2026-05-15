package java017_collection.part01;

import java.util.TreeMap;

// TreeMap
// 1. Map 인터페이스를 구현한 클래스
// 2. 정렬(Tree)을 제공하는 클래스

public class Java196_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(); // 정렬이 필요할 때, TreeMap
		tmap.put(10, "java");
		tmap.put(30, "spring");
		tmap.put(20, "jsp");

		for (int key : tmap.keySet()) // Integer 의 값에 따라 자동으로 정렬
			System.out.printf("%d %s\n", key, tmap.get(key));
	}
}
