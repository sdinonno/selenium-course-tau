package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    private WebDriver driver;
    private By clickHereLink = By.xpath("//a[contains(text(),'Click Here')]");


    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHere(){
        driver.findElement(clickHereLink).click();
    }


}