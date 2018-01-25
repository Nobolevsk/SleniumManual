package pages;

import Utils.BaseForTest2;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Новруз on 25.01.2018.
 */
public class BaseClass {
    public WebDriver driver = BaseForTest2.driver;
    Wait<WebDriver> wait = new WebDriverWait(driver,5);
}
