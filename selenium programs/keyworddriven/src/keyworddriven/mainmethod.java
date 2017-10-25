package keyworddriven;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;

public class mainmethod {
	static WebDriver d;

	public static void main(String[] args) throws Exception {

		//Logger log= Logger.getLogger("")
		operation o = new operation(d);
		object h = new object();
		Properties prop = h.set();
		excelsetpath e = new excelsetpath();
		Sheet s = e.setpath("C:\\Users\\Sanddep B\\Desktop", "keyword1.xls", "Sheet1");
		int rowcount = s.getLastRowNum();
		System.out.println(rowcount);
		for (int i = 1; i < rowcount + 1; i++) {
			Row row = s.getRow(i);

			if ((row.getCell(0).toString().length() == 0)) {
				System.out.println(row.getCell(1).toString() + "" + row.getCell(2).toString() + ""
						+ row.getCell(3).toString() + "" + row.getCell(4).toString());
				o.perform(prop, row.getCell(1).toString(), row.getCell(2).toString(), row.getCell(3).toString(),
						row.getCell(4).toString());

			} else {
				System.out.println("New testcas" + row.getCell(0).toString() + "started");

			}

		}
	}

}
