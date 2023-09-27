//이미지
package ch08.ces01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyMain {

	public static void main(String[] args) throws IOException {
		FileInputStream fio = new FileInputStream("C:\\javatest10\\자연휴양림.jpg");
		FileOutputStream fos = new FileOutputStream("C:\\javatest10\\kdj.jpg");
		
		while (true) {
			int data = fio.read();
			if (data == -1)break;
			fos.write(data);	
		}
	
		System.out.println("복사완료되었습니다.");
		fio.close();
		fos.close();
		System.out.println("the end");
	}

}
