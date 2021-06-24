import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CompareUIwithDatabase extends PageObject {

    //    --------------------- SOAL No. 1 ---------------------

    List<WebElement> column = getDriver().findElements(By.xpath("//table/thead/tr/th"));
    int number_of_column = column.size();

    List<WebElement> rows = getDriver().findElements(By.xpath("//table/tbody/tr/td[1]"));
    int number_of_rows = rows.size();

    ArrayList<String> DBData;

    public ArrayList<String> getDataPerRow(Integer row) {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 1; i <= number_of_column; i++) {
            List<WebElement> cell = getDriver().findElements(By.xpath("//table/tbody/tr[" + row + "]/td[" + i + "]"));
            for (WebElement element : cell) {
                data.add(element.getText());
            }
        }

        return data;
    }

    public ArrayList<String> getDataFromDB(String parameter){
        DBData  = DBConnection.getDataDB("SELECT * FROM Transactions WHERE Username = '" + parameter + "'");
        return DBData;
    }

    public void compareDataDashboardWithDB(){
        for (int i = 1; i <= number_of_rows; i++){
            ArrayList<String> dataTabelPerRow = getDataPerRow(i);
            ArrayList<String> dataDB = getDataFromDB(dataTabelPerRow.get(1));

            Assert.assertEquals(dataTabelPerRow.size(), dataDB.size());

            for (int j = 0; j < dataDB.size(); j++){
                if (dataDB.get(j) == dataTabelPerRow.get(j)) {
                    Assert.assertTrue(true);
                }else {
                    Assert.assertTrue(false);
                }
            }
        }
    }
}
