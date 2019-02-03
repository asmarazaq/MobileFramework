package iPhone;

import ButtonsPage.Buttons;
import navigate.NavigateUi;
import TextFieldsPage.TextFields;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static common.Base.ad;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextFieldsTest extends NavigateUi {

    TextFields textFields;

    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        textFields = ui.getTextFields();

    }
    @Test
    public void typeOnUiTextFieldTest(){
        textFields.typeOnUiTextField();
    }

    @Test
    public void typeOnUiTextFieldRoundedTest(){
       textFields.typeOnUiTextFieldRounded();
    }
    @Test
    public void typeOnUiTextFieldSecureTest(){
       textFields.typeOnUiTextFieldSecure();
    }
    @Test
    public void typeOnUiTextFieldLeftViewTest(){
        textFields.typeOnUiTextFieldLeftView();
    }
}
