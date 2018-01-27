package steps;

import pages.Ordering;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Новруз on 27.01.2018.
 */
public class OrderingSteps extends BaseStepsForTest {

    @Step("Заполнение полей для оформления {0}")
    public void orderIncuranceTravelers (String orderTravel){
        new Ordering(driver).Inputs(orderTravel);
    }
}
