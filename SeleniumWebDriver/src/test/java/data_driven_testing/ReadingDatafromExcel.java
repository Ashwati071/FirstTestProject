package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//File--->Workbook-->Sheets-->rows-->cells

public class ReadingDatafromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet=workbook.getSheet("Sheet1");

		int totrow=sheet.getLastRowNum();
		int totcell=sheet.getRow(0).getLastCellNum();

		for(int r=0;r<=totrow;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=1;c<totcell;c++)
			{
				XSSFCell currentcell=currentrow.getCell(c);
				System.out.print(currentcell.toString()+"\t");
			}

			System.out.println();
		}
		workbook.close();
		file.close();

	}

}
