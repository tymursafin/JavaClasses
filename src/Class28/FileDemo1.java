package Class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        var path = "Data/Students.xlsx";
        var fileInputStream = new FileInputStream(path);
        var xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet2");
        /*Row row0 = sheet.getRow(0);
        System.out.println(row0.getCell(0));
        Row row1 = sheet.getRow(1);
        System.out.println(row1.getCell(0));*/
        var numberOfRows = sheet.getPhysicalNumberOfRows();


        for (int i = 0; 1 < numberOfRows; i++) {
            Row row = sheet.getRow(i);
            var numberOfCells = row.getPhysicalNumberOfCells(); // returns the total number of cells that contain data
            for (int j = 0; j < numberOfCells; j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
