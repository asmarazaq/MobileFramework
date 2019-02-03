package Tests;

import HomePage.HomePage;
import YoutubePage.YoutubePage;
import common.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YoutubePageTest extends Base {

    HomePage homePage;
    YoutubePage youtubePage;
    @BeforeMethod
    public void setup(){
        this.homePage = new HomePage();
        youtubePage = homePage.clickOnYoutubeIcon();
    }
    @Test
    public void homeLogoVisibilityTest(){
        youtubePage.homeLogoVisibility();
    }
    @Test
    public void searchIconValidationTest(){
        youtubePage.searchIconValidation();
    }
    @Test
    public void videoSearchTest(){
        youtubePage.videoSearch("selenium tutorial");
    }
}
