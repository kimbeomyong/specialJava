package ch08.ces01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterMain {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:/javatest10/gawriter.txt");// 파일 경로를 적어준다.

			while (true) {
				String inputData = scan.nextLine();
				if (inputData.length() == 0) {
					break;
				}
				fw.write(inputData, 0, inputData.length());//엔터를 입력하면 계속 값을 저장해준다.
				fw.write("/r/n", 0, 2);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		scan.close();
		fw.close();
		System.out.println("the end");
	}

}
