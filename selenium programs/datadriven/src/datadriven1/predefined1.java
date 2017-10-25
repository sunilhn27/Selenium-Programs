package datadriven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class predefined1 {
	static String filename = "blank.xls";
	static String path = "C:\\Users\\Sanddep B\\Desktop";
	static Workbook wb;
	static Sheet sh;
	static Row row;
	static Cell cell;

	public static String CellData;

	public static Sheet setpath() throws Exception {
		File f = new File(path + "//" + filename);
		FileInputStream fs = new FileInputStream(f);
		String ext = filename.substring(filename.indexOf("."));
		System.out.println(ext);
		if (ext.equalsIgnoreCase(".xlsx")) {
			wb = new XSSFWorkbook(fs);

		} else if (ext.equalsIgnoreCase(".xls")) {
			wb = new HSSFWorkbook(fs);
		}
		sh = wb.getSheet("Sheet1");
		return sh;
	}

	public static void setcelldata(int rownum, int colnum, String data) throws Exception {

		row = sh.getRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(new File(path + "//" + filename));
		wb.write(fos);
	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {
		row = sh.getRow(RowNum);
		cell = row.getCell(ColNum);
		CellData = cell.toString();
		return CellData;

	}

}