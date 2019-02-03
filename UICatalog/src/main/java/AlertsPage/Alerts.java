package AlertsPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Alerts extends Base{

    public void showActionSheetSimple(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]\n");
        clickByXpath("//XCUIElementTypeButton[@name=\"OK\"]");
    }
    public void showActionSheetOkCancel(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]");
    }
    public void showActionSheetCustom(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Show Customized\"]");

    }
    public void showAlertSimple(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]");
    }

    public void showAlertOkCancel(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[2]");
        WebDriverWait wait = new WebDriverWait(ad, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]\n")));
        Assert.assertEquals(element.getAttribute("label"),"OK");
    }
    public void showAlertCustom(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Show Custom\"]");
        WebDriverWait wait = new WebDriverWait(ad, 5);
        WebElement cancelButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeButton[@name=\"Cancel\"]")));
        Assert.assertEquals(cancelButton.getAttribute("name"),"Cancel");
    }

    public void showSecureTextInput(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Secure Text Input\"]");
        WebDriverWait wait = new WebDriverWait(ad, 10);
        WebElement passWordField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeAlert[@name=\"UIAlertView\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther")));
        Assert.assertEquals(passWordField.getAttribute("width"),"279");
    }
}
