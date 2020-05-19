package javascript;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import java.io.File;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUploadPage();
        fileUploadPage.uploadFile("G:\\Sofía Di Nonno\\selenium-course-tau\\selenium-course-tau\\src\\main\\resources");
       // Assert.assertEquals(FileUploadPage.getUploadedFiles(), "chromedriver", "Uploaded files incorrect");
    }
}
