package ch07.sec04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, String> hmDic = new HashMap<String, String>();

		// HashMap 추가(삽입)
		hmDic.put("baby", "아기");
		hmDic.put("love", "사랑");
		hmDic.put("apple", "사과");

		// HashMap 출력(키객체->set)
		Set<String> keyset = hmDic.keySet();
		for (String key : keyset) {
			System.out.printf("key =%s \t value =%s\n", key, hmDic.get(key));
		}

		// 검색기능
		while (true) {
			System.out.println("\n검색단어(종료:exit)>>");
			String search = sc.next().trim();
			if (search.equals("exit") || search.equals("EXIT")) {
				System.out.println("단어검색을 종료합니다.");
				break;
			}
			System.out.printf("%s >> %s", search, hmDic.get(search));
		}

		// 종료
		System.out.println("the end");

	}

}
