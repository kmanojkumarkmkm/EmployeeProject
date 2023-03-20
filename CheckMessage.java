package onesoft.exception.IOException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckMessage {

	public static void main(String[] args) throws IOException {
		// C:\\Users\\Dell\\Documents\\myFile.txt
		File f;
		int temp = 0;
		FileReader fileReader;
		try {
			f = new File("C:\\Users\\Dell\\Documents\\myFilee.txt");
			fileReader = new FileReader(f);

		} catch (Exception e) {
			System.out.println(e);
			f = new File("C:\\Users\\Dell\\Documents\\default.txt");
			fileReader = new FileReader(f);
		}

		while ((temp = fileReader.read()) != -1) {
			System.out.print((char) temp);

		}

		System.out.println("\nEnd...");
	}

}
