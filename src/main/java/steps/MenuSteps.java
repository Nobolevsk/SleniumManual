package steps;

import org.openqa.selenium.WebDriver;
import pages.Menu;
import ru.yandex.qatools.allure.annotations.Step;
import static steps.BaseStepsForTest.driver;

/**
 * Created by Новруз on 27.01.2018.
 */
public class MenuSteps  {

    public static WebDriver getDriver() {
        return driver;
    }

    @Step("Нажимаем на кнопку Застраховать себя и имущество {0}")
    public void incuranceYourself (String mainItem){
        new Menu(driver).selectMenu(mainItem);
    }

     @Step("Нажимаем на кнопку Страховать путешественников {0}")
     public void incuranceTravelars (String subMainItem){
         new Menu(driver).selectSubMenu(subMainItem);
        }

}
