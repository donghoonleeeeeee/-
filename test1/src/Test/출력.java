package Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class 출력 {
	public static void main(String[] args) {
		try {
			
			// 1. 파일 객체 생성
			File file = new File("D:\\test\\javaprint.txt");
			
			// 2. 파일 존재여부 체크 및 생성
			if(!file.exists())
			{
				file.createNewFile();	
			}
			
			// 3. Buffer를 사용해서 File에 write할 수 있는 VufferedWriter 생성
			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fw);
			
			// 4. 파일에 쓰기
			writer.write("가나다라마바사" + '\n');
			writer.write("Nice to meet you");
			writer.write("!!");
			
			// 5. BufferedWriter close
			writer.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
