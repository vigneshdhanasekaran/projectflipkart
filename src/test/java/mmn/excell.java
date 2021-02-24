package mmn;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excell {
	public static void main(String[] args) throws IOException {
		File loc= new File("C:\\Users\\VIGNESH\\eclipse-workspace\\mmn\\target\\data.xlsx");
		
		FileInputStream st=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(st);
		Sheet sheet=w.getSheet("dat");
		Row row = sheet.getRow(1);
		Cell c = row.getCell(0);
		System.out.println(c);
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row r=sheet.getRow(i);
		    for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c1=row.getCell(j);
				int type = c.getCellType();
				System.out.println(type);
				
				if(type ==1) {
					String value =c.getStringCellValue();
					System.out.println(value);
					}
				else {
					if(DateUtil.isCellDateFormatted(c)) {
						Date date=c.getDateCellValue();
						SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy");
						String value=sf.format(date);
						System.out.println(value);
						
					}
					else {
						double db= c.getNumericCellValue();
						long ln=(long)db;
						String value =String.valueOf(ln);
						System.out.println(value);
					
					}
				}
		}
		}
		
		  
		
		
		
		
		
		
		
		
		
		
		
	}

}
