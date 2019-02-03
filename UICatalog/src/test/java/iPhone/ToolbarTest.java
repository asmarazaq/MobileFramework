package iPhone;

import ToolbarPage.Toolbar;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ToolbarTest extends Base {

    public Toolbar toolbar(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getToolbar();
        return PageFactory.initElements(ad, Toolbar.class);
    }
    @Test
    public void imageTest() throws InterruptedException {
        toolbar().setImage();
        sleep(3);
    }
    @Test
    public void tintedTest() throws InterruptedException {
        toolbar().setTinted();
        sleep(2);
    }
    @Test
    public void styleDefaultTest() throws InterruptedException {
        toolbar().setStyleDefault();
        sleep(2);
    }
    @Test
    public void styleBlackTest() throws InterruptedException {
        toolbar().setStyleBlack();
        sleep(2);
    }
    @Test
    public void styleTranslucient() throws InterruptedException{
        toolbar().setStyleTranslucent();
        sleep(2);
    }
    @Test
    public void doneTest()throws InterruptedException{
        toolbar().setDone();
        sleep(2);
    }
    @Test
    public void item1Test() throws InterruptedException{
        toolbar().setItem1();
        sleep(2);
    }
    @Test
    public void item2Test()throws InterruptedException{
        toolbar().setItme2();
        sleep(2);
    }
    @Test
    public void toolsTest() throws InterruptedException{
        toolbar().setTools();
        sleep(2);
    }

}