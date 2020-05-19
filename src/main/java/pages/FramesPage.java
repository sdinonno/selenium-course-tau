package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private By nestedFramesLink = By.xpath("//a[contains(text(),'Nested Frames')]");


    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFramesPage(){
        driver.findElement(nestedFramesLink).click();
        return new NestedFramesPage(driver);
    }
}
