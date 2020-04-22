package password;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        EmailSentPage emailSentPage = forgotPasswordPage.retrievePassword("tau@example.com");
        Assert.assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!", "Message is incorrect");
    }

}
