import com.github.crab2died.ExcelUtils;
import com.github.crab2died.exceptions.Excel4JException;
import com.nacei.model.CustomerComplaintModel;
import com.nacei.model.SalesOfNewProductsModel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.List;

public class ccr {


    public static void main(String[] args) {
        String path = "C:\\Users\\ab1324ab\\Desktop\\新品销售量统计 (2).xlsx";
        try {
          List<SalesOfNewProductsModel> complaints = ExcelUtils.getInstance().readExcel2Objects(path, SalesOfNewProductsModel.class, 1, 0);
            System.out.println("111111");
        } catch (Excel4JException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
