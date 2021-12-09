import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {


        ReadFromExcel re = new ReadFromExcel();

        re.readFromFileUniversity("universityInfo.xls");
        re.readFromFileStudent("universityInfo.xls");






    }
}
