package pack1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Ex1{
	String S1;
	public void WorkBookCreate(String S) throws IOException
	{
		
		 Workbook wb = new XSSFWorkbook();
		 Sheet sheet = wb.createSheet("Data1");
		 
		  
		  Row row = sheet.createRow((short)0);
		  Row row1 = sheet.createRow((short)1);
		    // Create a cell and put a value in it.
		    //Cell cell = row.createCell(0);
		   //cell.setCellValue(1);

		    // Or do it on one line.
		    row.createCell(0).setCellValue(1.2);
		    row.createCell(1).setCellValue(1.3);
		    row.createCell(2).setCellValue(true);
		    row1.createCell(0).setCellValue(true);
		    // Write the output to a file
		    FileOutputStream fileOut = new FileOutputStream(S);
		    wb.write(fileOut);
		    fileOut.close();
		    		    
	}
}


public class App {

	public static void main(String[] args) throws IOException {
		
		Ex1 obj1 = new Ex1();
		System.out.println("Please enter file name to create xls file");
		
	   Scanner in =new Scanner(System.in);
	   String S2= in.nextLine();
		obj1.WorkBookCreate(S2);
	}

}