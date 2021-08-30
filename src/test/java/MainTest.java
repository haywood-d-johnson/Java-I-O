
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;

public class MainTest {

    @Test
    public void test_file_exists() {
        //Tests if txt files exist; Preimptive IOEXception 
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/resources/comma.txt"));
            System.out.println("Testing Assertion...");
            String line;
            while ((line = br.readLine()) != null) {
                assert line != null;
                break;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
//    @Test
//    public void tes_date_fromatter() {
//        //Record r = new Record();
//        //String testDate = "6-3-1975";
//        
//        //r.setDate()
//    }
}