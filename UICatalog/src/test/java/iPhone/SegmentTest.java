package iPhone;

import SegmentsPage.Segments;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SegmentTest extends Base {

    public Segments segments(){
        UiCatalog uiCatalog = PageFactory.initElements(ad,UiCatalog.class);
        uiCatalog.getSegments();
        return PageFactory.initElements(ad, Segments.class);
    }
    @Test(priority = 1,enabled = true)
    public void SegmentedControlTest() throws InterruptedException {
        segments().setUiSegmentControl();
        sleep(2);
    }
    @Test(priority = 2,enabled = true)
    public void SegmentedStyleTest() throws InterruptedException {
        segments().setUiSegmentControlStyleBordered();
        sleep(2);
    }
    @Test(priority = 3,enabled = true)
    public void SegmentedControlBarTest() throws InterruptedException {
        segments().setUiSegmentControlStyleBar();
        sleep(2);
    }
    @Test(priority = 4,enabled = true)
    public void SegmentedControlTintTest() throws InterruptedException {
        segments().setUiSegmentControlStyleBarTint();
        sleep(2);
    }
    @Test(priority = 5,enabled = true)
    public void SegmentedControlImageTest() throws InterruptedException {
        segments().setUiSegmentcontrolStyleBarImage();
        sleep(2);
    }
}
