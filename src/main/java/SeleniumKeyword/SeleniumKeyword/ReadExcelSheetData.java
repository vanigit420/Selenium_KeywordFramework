package SeleniumKeyword.SeleniumKeyword;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelSheetData {
	
public ArrayList readExcelData(int colNo) throws IOException {
		
		String filepath = FrameworkConstants.filepath;
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		java.util.Iterator<Row> row = sheet.rowIterator();
		row.next();
		
		ArrayList <String> a = new ArrayList();
		while(row.hasNext()){
			
			Row r = (Row)row.next();
			 org.apache.poi.ss.usermodel.Cell c = r.getCell(colNo);
			 String data = c.getStringCellValue();
			 a.add(data);
			 a.add(((Row)row.next()).getCell(colNo).getStringCellValue());
			
		}
		System.out.println("List: " + a);
		return a;
	}

	public void DemoFile(int i) {
		// TODO Auto-generated method stub
		
	}

}


