package onesoft.exception.IOException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckMyMail {
// master change in git
	public static void main(String[] args) throws IOException {

		try {
		File f = new File("C:\\Users\\Dell\\Documents\\myMail.txt");
		FileReader fr = new FileReader(f);
		int temp=0;
		// its my change 
		int xyz=0;
		String abc="This change In Local";
		while ((temp=fr.read())!=-1) {
			System.out.print((char)temp);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
// ex, handle , finally ,serialize, marker , checked uncheked, multicatch ,highercy, cutomer exception / ex progaram for all
