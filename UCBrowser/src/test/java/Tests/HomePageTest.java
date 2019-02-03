package Tests;

import HomePage.HomePage;
import common.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends Base {

    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
    }

    @Test
    public void headLineVisibilityTest(){
        homePage.isHeadlineVisible();
    }
    @Test
    public void hotVideoVisibilityTest(){
        homePage.isHotVideosVisible();
    }
    @Test
    public void youTubeVisibilityTest(){
        homePage.isYouTubeVisible();
    }
    @Test
    public void googleVisibilityTest(){
        homePage.isGoogleVisible();
    }

}
