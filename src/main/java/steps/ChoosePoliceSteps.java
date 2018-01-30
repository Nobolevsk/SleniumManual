package steps;

import pages.ChoosePolice;
import ru.yandex.qatools.allure.annotations.Step;
import static steps.BaseStepsForTest.driver;

/**
 * Created by Новруз on 27.01.2018.
 */
public class ChoosePoliceSteps {

    @Step("Выбераем вид полиса Минимальная {0}")
    public void selectPolice(String min){
        new ChoosePolice().minimalnaya(min);
    }

    @Step("Выбераем вид полиса Минимальная {0}")
    public void selectOrder(String next){
        new ChoosePolice(driver).orderItem(next);
    }
}
