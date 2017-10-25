package datacompare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class loginlogic {
	static String filename = "blank.xls";
	static String path = "C:\\Users\\Sanddep B\\Desktop";
	static Workbook wb;
	static Sheet sh;
	static Row row;
	static Cell cell;
	static File f;
	public static String CellData;

	public static Sheet setpath() throws Exception {
		f = new File(path + "\\" + filename);
		FileInputStream fs = new FileInputStream(f);
		String exten = filename.substring(filename.indexOf("."));
		System.out.println(exten);
		if (exten.equalsIgnoreCase(".xls")) {
			wb = new HSSFWorkbook(fs);
		} else if (exten.equalsIgnoreCase(".xlsx")) {
			wb = new XSSFWorkbook(fs);
		}
		sh = wb.getSheet("Sheet1");
		return sh;
	}

public static void setcelldata1(int rowno, int colno, String data) throws Exception {
	row = sh.getRow(rowno);
	cell = row.createCell(colno);
	cell.setCellValue(data);
	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);
}

public static String getdata(int rowno, int colno) {
	row = sh.getRow(rowno);
	cell = row.getCell(colno);
	CellData=cell.toString();
	return CellData;

}

}
