package TextViewPage;

import common.Base;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextView  extends Base {

    public void textViewButton(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"TextView\"]");
    }

}
