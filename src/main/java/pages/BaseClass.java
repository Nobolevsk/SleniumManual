package pages;

import steps.BaseStepsForTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Новруз on 25.01.2018.
 */
public class BaseClass {
    public WebDriver driver = BaseStepsForTest.driver;
    Wait<WebDriver> wait = new WebDriverWait(driver,5);
}
