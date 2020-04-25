package slider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class SliderTests extends BaseTests {


    @Test
    public void testRangeFour(){
        String value = "4";
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.enterRange(value);
        Assert.assertEquals(horizontalSliderPage.getRange(), value, "Slider value is incorrect");
    }
}
