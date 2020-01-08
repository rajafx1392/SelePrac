package org.sample.chrdri;

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

public class Excel {
	
	public static void main(String[] args) throws IOException {
		
		
		File loc= new File("F:\\Raja\\Seleniumws\\SelePrac\\src\\org\\sample\\chrdri\\Raja.xlsx");
		Workbook w= new XSSFWorkbook();
		FileInputStream stream= new FileInputStream(loc);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
        int cellType = c.getCellType();	
        
        if(cellType==1) {
        	String data = c.getStringCellValue();
        	System.out.println(data);
        } else if(cellType==0) {
        	
        	if(DateUtil.isCellDateFormatted(c)) {
        	
        		Date d = c.getDateCellValue();
        		SimpleDateFormat sd= new SimpleDateFormat("MM/DD/YYYY");        		
        		String format = sd.format(d);       		
        		System.out.println(format);      		
        	}else {
        		
        		double numericCellValue = c.getNumericCellValue();        		
        		long l= (long)numericCellValue;
        		String valueOf = String.valueOf(l);
        		System.out.println(valueOf);
        		
           		
        	}
   
        }
		
	}

}
