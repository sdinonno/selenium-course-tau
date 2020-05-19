package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By rectangleArea = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }


    public void rightClickRectangleArea(){
        WebElement area = driver.findElement(rectangleArea);
        Actions action = new Actions(driver);
        //contextClick() es click derecho
        action.contextClick(area);
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }


}
