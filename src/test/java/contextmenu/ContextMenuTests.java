package contextmenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testGetTextFromAlert(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickRectangleArea();

        String alertMessage = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();

        Assert.assertEquals(alertMessage, "You selected a context menu", "Alert message incorrect");

    }
}
