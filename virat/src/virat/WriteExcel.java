package virat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.NetworkChannel;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class WriteExcel {
	
	
	public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\VIJJU\\Desktop\\Facebookcretentials.xlsx");
        FileInputStream fs=new FileInputStream(f);
		XSSFWorkbook w=new XSSFWorkbook(fs);
		XSSFSheet Sheet=w.getSheetAt(0);
		Sheet.createRow(0).createCell(0).setCellValue("hello");
		Sheet.createRow(0).createCell(1).setCellValue("world");
		Sheet.createRow(0).createCell(2).setCellValue("hi");

		FileOutputStream fo=new FileOutputStream(f);
		w.write(fo);
		w.close();}
	
	
}
