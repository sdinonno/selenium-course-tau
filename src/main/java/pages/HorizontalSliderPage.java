package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.xpath("//div[@class='sliderContainer']//input");
    private By rangeText = By.id("range");


    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterRange(String range) {
        while(!getRange().equals(range)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getRange(){
        return driver.findElement(rangeText).getText();
    }

}
