package keyworddriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelsetpath {
	static String filename = "keyword1.xls";
	static String path = "C:\\Users\\Sanddep B\\Desktop";
	static Workbook wb;
	static Sheet sh;
	static Row row;
	static Cell cell;
	static String CellData;
	
	public static Sheet setpath(String path,String filename,String Sheet) throws Exception {
		File f = new File(path + "\\" + filename);
		FileInputStream fs = new FileInputStream(f);
		String ext = filename.substring(filename.indexOf("."));
		System.out.println(ext);
		if (ext.equalsIgnoreCase(".xlsx")) {
			wb = new XSSFWorkbook(fs);

		} else if (ext.equalsIgnoreCase(".xls")) {
			wb = new HSSFWorkbook(fs);
		}
		
		sh = wb.getSheet(Sheet);
		return sh;
		
	}


	

}
