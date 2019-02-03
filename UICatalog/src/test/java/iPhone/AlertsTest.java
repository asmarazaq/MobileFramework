package iPhone;

import AlertsPage.Alerts;
import TextFieldsPage.TextFields;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends Base {

    Alerts alerts;

    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        alerts = ui.getAlerts();

    }
    @Test
    public void testActionSheetSimple() throws InterruptedException {
        alerts.showActionSheetSimple();
        sleep(2);
    }
    @Test
    public void testActionSheetOkCancel() throws InterruptedException {
        alerts.showActionSheetOkCancel();
        sleep(2);
    }
    @Test
    public void testActionSheetCustom() throws InterruptedException {
        alerts.showActionSheetCustom();
        sleep(2);
    }
    @Test
    public void testAlertSimple() throws InterruptedException {
        alerts.showAlertSimple();
        sleep(2);
    }
    @Test
    public void testAlertOkCancel() throws InterruptedException {
        alerts.showAlertOkCancel();
        sleep(2);
    }
    @Test
    public void testAlertCustom() throws InterruptedException {
        alerts.showAlertCustom();
        sleep(2);
    }
    @Test
    public void testSecureInput() throws InterruptedException {
        alerts.showSecureTextInput();
        sleep(2);
    }

}
