package data_driven_testing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;

//Workbook-->Sheet-->Row-->Cell -->File

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcelDynamically {

	public static void main(String[] args) throws IOException {
		

        XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet3 = workbook.createSheet("Sheet3");
		
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows=sc.nextInt();
        System.out.println("enter no of cells");
        int cells=sc.nextInt();
        for(int i=0;i<=rows;i++)
        {
        	XSSFRow currentrow=sheet3.createRow(i);
        	for(int j=0;j<cells;j++)
        	{
        		currentrow.createCell(j).setCellValue(sc.next());
        	}
        }
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile1.xlsx");
		workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("File is created");

	}

}
