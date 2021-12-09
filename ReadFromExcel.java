import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Iterator;

public class ReadFromExcel {

    public void readFromFileUniversity(String file) throws IOException {
        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
        HSSFSheet myExcelSheet = myExcelBook.getSheet("Студенты");
        new FileInputStream(new File("universityInfo.xls"));

        Iterator<Row> rowIterator = myExcelSheet.iterator();
        rowIterator.next();// Для того чтобы пропустить первую строку, это id университета

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                switch (cell.getCellType()) {
                    case STRING:
                        System.out.println(cell.getStringCellValue() + "\t");
                        break;
                    case  NUMERIC:
                        System.out.println(cell.getNumericCellValue() + "\t");
                        break;
                    default:
                }


            }
            System.out.println("--------");
        }

        myExcelBook.close();


    }

    public void readFromFileStudent(String file) throws IOException {
        HSSFWorkbook myExcelBook2 = new HSSFWorkbook(new FileInputStream(file));
        HSSFSheet myExcelSheet2 = myExcelBook2.getSheet("Университеты");
        new FileInputStream(new File("universityInfo.xls"));

        Iterator<Row> rowIterator2 = myExcelSheet2.iterator();
        rowIterator2.next();// Для того чтобы пропустить первую строку, это id университета

        while (rowIterator2.hasNext()) {
            Row row = rowIterator2.next();

            Iterator<Cell> cellIterator2 = row.cellIterator();

            while (cellIterator2.hasNext()) {
                Cell cell2 = cellIterator2.next();

                switch (cell2.getCellType()) {
                    case STRING:
                        System.out.println(cell2.getStringCellValue() + "\t");
                        break;
                    case  NUMERIC:
                        System.out.println(cell2.getNumericCellValue() + "\t");
                        break;
                    default:
                }


            }
            System.out.println("--------");
        }

      myExcelBook2.close();


    }


}

