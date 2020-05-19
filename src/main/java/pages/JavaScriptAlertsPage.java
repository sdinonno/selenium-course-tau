package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By jsAlertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By jsConfirm = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By jsPrompt = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
    private By resultMessage = By.xpath("//p[@id='result']");



    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(jsAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(jsConfirm).click();
    }

    public void triggerPrompt(){
        driver.findElement(jsPrompt).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(resultMessage).getText();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
