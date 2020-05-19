package javascript;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlert();
        javaScriptAlertsPage.alert_clickToAccept();
        Assert.assertEquals(javaScriptAlertsPage.getResult(), "You successfuly clicked an alert", "Results text incorrect");
    }

    @Test
    public void testGetTextFromAlertConfirm(){

        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerConfirm();

        String text = javaScriptAlertsPage.alert_getText();

        javaScriptAlertsPage.alert_clickToDismiss();
        Assert.assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlertPrompt(){

        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerPrompt();

        String text = "TAU rocks!";
        javaScriptAlertsPage.alert_setInput(text);
        javaScriptAlertsPage.alert_clickToAccept();

        Assert.assertEquals(javaScriptAlertsPage.getResult(), "You entered: " + text, "Results text incorrect");
    }

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDomPage().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

}
