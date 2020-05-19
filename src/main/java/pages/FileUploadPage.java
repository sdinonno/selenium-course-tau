package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By fileUploadButton = By.xpath("//input[@id='file-upload']");
    private By uploadSubmitButton = By.xpath("//input[@id='file-submit']");
    private By uploadedFiles = By.id("uploaded-files");


    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadSubmitButton).click();
    }

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(fileUploadButton).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }


}
