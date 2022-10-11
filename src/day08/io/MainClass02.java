package day08.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  
 * 
 * 
 * 
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// test1.txt 파일을 읽기위한 객체 (FileInputStream)
			fis = new FileInputStream("./resources/test1.txt");
			// FileOutputStream 객체생성시 매개변수는 반드시 경로가 존재해야함.
			// 또한 경로가 존재하면 객체 생성시 text2.txt 파일도 만들어짐.
			fos = new FileOutputStream("./resources/test1.txt");

			int readByteCnt = 0;
			byte[] b = new byte[3];
			
			// fis.read(b) = > b 길이 만큼 읽어서 반환
			// readByteCnt 에 저장
			while ((readByteCnt = fis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);
			}

		} catch (IOException e) {

			System.out.println("IOException 발생!");

		} finally {
			try {
				if (fis != null)
					;
				{
					fis.close();
				}
				if (fis != null)
					;
				{
					fis.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	

}
