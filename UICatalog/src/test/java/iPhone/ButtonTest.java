package iPhone;

import ButtonsPage.Buttons;
import navigate.NavigateUi;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static common.Base.ad;

/**
 * Created by mrahman on 9/5/15.
 */
public class ButtonTest extends NavigateUi {

    Buttons buttons;

    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        buttons = ui.getButtonPage();

    }

    @Test
    public void clickOnBackgroundImageButtonTest(){
        buttons.clickOnBackgroundImageButton();
    }

    @Test
    public void clickOnBackgroundWithImageButtonTest(){
        buttons.clickOnBackgroundImageButton();
    }


}
