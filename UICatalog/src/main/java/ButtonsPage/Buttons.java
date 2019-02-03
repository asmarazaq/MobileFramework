package ButtonsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by mrahman on 1/15/17.
 */
public class Buttons extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]\n")
    WebElement backgroundImageButton;

    public void clickOnBackgroundImageButton(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Gray\"]\n");
    }

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    WebElement buttonWithImageButton;

    public void clickOnButtonWithImageButton(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Right pointing arrow\"]");
    }

}
