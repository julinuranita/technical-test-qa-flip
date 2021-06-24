import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LandingPagePages extends PageObject {

    @FindBy(xpath = "//*[@class='btn-grey-flip' and @href='https://flipid.zendesk.com']")
    WebElement btn_bantuan;
    @FindBy(xpath = "//*[@class='btn-grey-flip' and @href='https://flip.id/karir']")
    WebElement btn_karir;
    @FindBy(xpath = "//*[@id='section1']/div[1]/div[1]/ul/li[3]/a")
    WebElement btn_biaya;
    @FindBy(xpath = "//*[@class='border-round btn-grey-flip btn-register-daftar']")
    WebElement btn_masuk;

    public void validateButtonIsDisplayed(String buttonName){

        switch (buttonName){
            case    "Bantuan":
                Assert.assertTrue(btn_bantuan.isDisplayed());
                Assert.assertEquals(buttonName, btn_bantuan.getText());
                break;
            case    "Karir":
                Assert.assertTrue(btn_karir.isDisplayed());
                Assert.assertEquals(buttonName, btn_karir.getText());
                break;
            case    "Biaya":
                Assert.assertTrue(btn_biaya.isDisplayed());
                Assert.assertEquals(buttonName, btn_biaya.getText());
                break;
            case    "Masuk":
                Assert.assertTrue(btn_masuk.isDisplayed());
                Assert.assertEquals(buttonName, btn_masuk.getText());
                break;

        }
    }

    public void clickMenuButton(String buttonName){

        switch (buttonName){
            case    "Bantuan":
                btn_bantuan.click();
                break;
            case    "Karir":
                btn_karir.click();
                break;
            case    "Biaya":
                btn_biaya.click();
                break;
            case    "Masuk":
                btn_masuk.click();
                break;

        }
    }

}
