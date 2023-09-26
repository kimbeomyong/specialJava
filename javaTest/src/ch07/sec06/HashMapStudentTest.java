package ch07.sec06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudentTest {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Student> hsMap = new HashMap<String, Student>();

		// HashMap 추가
		hsMap.put("황기태", new Student(1, "010-111-1111"));
		hsMap.put("이재문", new Student(2, "010-222-2222"));
		hsMap.put("김남운", new Student(3, "010-333-3333"));

		// HashMap 출력(keySet 변동)
		Set<String> keyset = hsMap.keySet();
		for (String key : keyset) {
			Student stu = hsMap.get(key);
			System.out.printf("key = %s value = %s \n", key, hsMap.get(key).toString());
		}
		System.out.println("\n----------------------------------------------------");

		Iterator<String> ir = keyset.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			System.out.printf("key = %s value = %s \n", key, hsMap.get(key).toString());
		}

		// HashMap 검색기능
		while (true) {
			System.out.println("\n검색단어(종료:exit)>>");
			String search = scan.next().trim();
			if (search.equals("exit") || search.equals("EXIT")) {
				System.out.println("단어검색을 종료합니다.");
				break;
			}
			if (hsMap.get(search) != null) {
				System.out.printf("%s >> %s", hsMap.get(search).toString());
			} else {
				System.out.printf("%s >> %s", search, "해당되는객체가 없습니다.");
			}
		}
		System.out.println("\nThe end");

	}
}
