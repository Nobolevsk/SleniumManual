package steps.Task3;

import pages.ChoosePolice;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Новруз on 27.01.2018.
 */
public class ChoosePoliceSteps extends BaseStepsForTest {

    @Step("Выбераем вид полиса Минимальная {0}")
    public void selectPolice(String min){
        new ChoosePolice(driver).minimalnaya(min);
    }

    @Step("Выбераем вид полиса Минимальная {0}")
    public void selectOrder(String next){
        new ChoosePolice(driver).orderItem(next);
    }
}
