package virat;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexceldata {
 FileInputStream fs;
	 Workbook w;
	 Sheet s;
	public  void readexcel() throws EncryptedDocumentException, InvalidFormatException, IOException{
		String str="C:\\Users\\VIJJU\\Desktop\\Facebookcretentials.xlsx";
		fs=new FileInputStream(str);
		w=WorkbookFactory.create(fs);
		s=w.getSheet("ajay");
		
		
	}

}
