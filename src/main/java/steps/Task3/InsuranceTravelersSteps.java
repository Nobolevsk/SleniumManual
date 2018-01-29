package steps.Task3;

import pages.InsuranceTravelers;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Новруз on 27.01.2018.
 */
public class InsuranceTravelersSteps extends BaseStepsForTest {

    @Step("Переходим на новую страницу страхования путешественников")
    public void newTravelers (){
        new InsuranceTravelers(driver).orderOnline();
    }
}
