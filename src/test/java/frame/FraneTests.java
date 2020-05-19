package frame;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;
import pages.WysiwygEditorPage;

public class FraneTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        WysiwygEditorPage editorPage = homePage.clickWysiwygEditorPage();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();

        editorPage.setTextArea(text2);

        //verificamos el texto ingresado
        Assert.assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");

    }

    @Test
    public void testNestedFrames(){
        FramesPage framesPage = homePage.clickFramesPage();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesPage();

        String textLeftFrame = nestedFramesPage.getTextLeftFrame();
        String textBottomFrame = nestedFramesPage.getTextBottomFrame();


    }
}
