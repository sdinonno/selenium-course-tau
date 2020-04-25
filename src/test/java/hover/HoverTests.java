package hover;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);

        Assert.assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");






    }
}
