package steps;

import org.openqa.selenium.WebDriver;
import pages.InsuranceTravelers;
import ru.yandex.qatools.allure.annotations.Step;
import static steps.BaseStepsForTest.driver;

/**
 * Created by Новруз on 27.01.2018.
 */
public class InsuranceTravelersSteps {

    public static WebDriver getDriver() {
        return driver;
    }

    @Step("Переходим на новую страницу страхования путешественников")
    public void newTravelers (){
        new InsuranceTravelers(driver).orderOnline();
    }
}
