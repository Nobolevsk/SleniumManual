import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

/**
 * Created by Новруз on 27.01.2018.
 */
public class TestWithAllureReport extends BaseStepsForTest {


    @Test
    @Title("Страхование путешественников")
    public void incuranceTest (){
        MenuSteps menuSteps = new MenuSteps();
        InsuranceTravelersSteps insuranceTravelersSteps = new InsuranceTravelersSteps();
        ChoosePoliceSteps choosePoliceSteps = new ChoosePoliceSteps();
        OrderingSteps orderingSteps = new OrderingSteps();

        menuSteps.incuranceYourself("Застраховать себя");
        menuSteps.incuranceTravelars("Страхование путешественников");

        insuranceTravelersSteps.newTravelers();

        choosePoliceSteps.selectPolice("Минимальная");
        choosePoliceSteps.selectOrder("Оформить");

        orderingSteps.orderIncuranceTravelers("fff");




    }
}
