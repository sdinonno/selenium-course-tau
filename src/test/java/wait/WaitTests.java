package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        DynamicLoadingExample1Page loadingPage = homePage.clickDynamicLoadingPage().clickExample1();
        loadingPage.clickStart();

        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

}
