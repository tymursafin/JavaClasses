package class29;

import utils.ExcelReader;

import java.io.IOException;

public class ExcelReadTest {
    public static void main(String[] args) throws IOException {
        var excelData = ExcelReader.read("Data/Students.xlsx");
        System.out.println(excelData);
    }
}
