package excel_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_read {
	
	public static String s1;
	
	public static  void putvalue(String s1) throws Exception
	{
		
		
		FileInputStream  f = new FileInputStream("C:\\Users\\845123\\eclipse-workspace\\PETCO(845123)Nithinkumar\\src\\testdata\\Petco_item_name.xlsx");
		File fi = new File("C:\\Users\\845123\\eclipse-workspace\\PETCO(845123)Nithinkumar\\src\\testdata\\Petco_item_name.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(f);
		XSSFSheet sh= workbook.getSheet("Sheet1");
		
	sh.createRow(4).createCell(0).setCellValue(s1);
		
		FileOutputStream fo = new FileOutputStream(fi);
		
		workbook.write(fo);
		
		
		
	}
		
	}


