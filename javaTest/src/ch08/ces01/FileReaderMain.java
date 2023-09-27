package ch08.ces01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		try {

			FileReader fr = new FileReader("C:/javatest10/JavaTest.txt");//파일 경로를 적어준다.
			while (true) {
				int data = fr.read();
				if (data == -1) {
					break;
				}
				System.out.print((char) data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
