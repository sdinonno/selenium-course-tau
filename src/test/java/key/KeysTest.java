package key;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTest extends BaseTests {

    @Test
    public void testBackspace(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");

        /* BACK_SPACE elimina un caracter antes del cursor*/
        /* DELETE elimina un caracter después del cursor*/

    }

    @Test
    public void testPi(){
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }
}
