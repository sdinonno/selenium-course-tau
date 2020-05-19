package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    //private WebDriver driver;
    private EventFiringWebDriver driver;
    protected HomePage homePage;


    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());

        /*driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");*/

        homePage = new HomePage(driver);
        goHome();

    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void takeScreenshot(){
        TakesScreenshot camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
        try{
            Files.move(screenshot, new File("resources/screenshots/test.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //para capturar cuando los test fallan
    /*
    @AfterMethod
    public void recordFailure(ITestResult result){

        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        if(ITestResult.FAILURE == result.getStatus())
        {
            TakesScreenshot camera = (TakesScreenshot)driver;
            Files.move(screenshot, new File("resources/screenshots/test.png"));

            try{
                Files.move(screenshot, new File("resources/screenshots/test.png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }*/

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }

}
