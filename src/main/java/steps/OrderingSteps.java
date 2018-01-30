package steps;

import org.openqa.selenium.WebDriver;
import pages.Ordering;
import ru.yandex.qatools.allure.annotations.Step;
import static steps.BaseStepsForTest.driver;

/**
 * Created by Новруз on 27.01.2018.
 */
public class OrderingSteps {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @Step("Заполнение полей для оформления")
    public void orderIncuranceTravelers (){
        new Ordering(driver).Inputs();
    }
}
