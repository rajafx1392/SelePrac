package org.sample.chrdri;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DatadrivenRead {
	
	public static void main(String[] args) throws IOException {
		
	File loc= new File("F:\\Raja\\Seleniumws\\SelePrac\\src\\org\\sample\\chrdri\\Raja.xlsx");
	
	FileInputStream stream= new FileInputStream (loc);
	Workbook w= new XSSFWorkbook(stream);
	
   Sheet s = w.getSheet("Sheet1");
   Row r = s.getRow(2);
   Cell c = r.getCell(2);
   int celltype= c.getCellType();

	
   if (celltype==1) {
  	 
  	 String cellValue = c.getStringCellValue();
  	 System.out.println(cellValue);
  	 
   }
   
   else if(celltype==0) {
  	 if(DateUtil.isCellDateFormatted(c)) {
  		 Date d = c.getDateCellValue();
  		 SimpleDateFormat sd= new SimpleDateFormat("dd/mm/yyyy");
  		 String format = sd.format(d);
  		 System.out.println(format);
  		 
  	 }
  	 else {
  		double getnum = c.getNumericCellValue();
  		long log= (long) getnum;
  		String valueOf = String.valueOf(log);
  		System.out.println(valueOf);
  		 
  		 
  	 }
  	 
  	 
		
	}
	
	
	}
	

}
