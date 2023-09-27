package ch08.ces01;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileInputSteamMain {
	public static void main(String[]args) {
		try {

//			FileReader fr = new FileReader("C:/javatest10/JavaTest.txt");//파일 경로를 적어준다.
			FileInputStream fr = new FileInputStream("C:/javatest10/JavaTest.txt");//파일 경로를 적어준다.
			InputStreamReader isr = new InputStreamReader(fr,"US-ASCII");
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
