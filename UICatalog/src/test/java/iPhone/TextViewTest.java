package iPhone;

import TextViewPage.TextView;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TextViewTest extends Base {

    public TextView textView(){
        UiCatalog uiCatalog = PageFactory.initElements(ad,UiCatalog.class);
        uiCatalog.getTextView();
        return PageFactory.initElements(ad, TextView.class);
    }
    @Test
    public void textViewTest(){
        textView().textViewButton();
    }
}
