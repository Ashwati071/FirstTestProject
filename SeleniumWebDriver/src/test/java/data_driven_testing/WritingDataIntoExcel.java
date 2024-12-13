package data_driven_testing;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Workbook-->Sheet-->Row-->Cell -->File

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet2 = workbook.createSheet("Sheet2");

		XSSFRow first_row=sheet2.createRow(0);
		first_row.createCell(0).setCellValue("Subject name");
		first_row.createCell(1).setCellValue("Name");

		XSSFRow second_row=sheet2.createRow(1);
		second_row.createCell(0).setCellValue("Java");
		second_row.createCell(1).setCellValue("Ashwati");

		XSSFRow third_row=sheet2.createRow(2);
		third_row.createCell(0).setCellValue("Python");
		third_row.createCell(1).setCellValue("Priya");

		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		workbook.write(file);
		workbook.close();
		file.close();

		System.out.println("File is created");  

	}

}
