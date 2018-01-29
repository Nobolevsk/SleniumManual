package steps;

import cucumber.api.java.en.When;

public class ScenarioSteps {

    MenuSteps menuSteps = new MenuSteps();
    InsuranceTravelersSteps travelersSteps = new InsuranceTravelersSteps();
    ChoosePoliceSteps policeSteps = new ChoosePoliceSteps();
    OrderingSteps orderingSteps = new OrderingSteps();


    @When("^Выбран пункт меню \"(.*)\"$")
    public void selectFirstMenuSteps (String main){
        menuSteps.incuranceYourself(main);
    }
    @When("^Выбран пункт подменю \"(.*)\"$")
    public void selectSecondMenuSteps(String subMain){
        menuSteps.incuranceTravelars(subMain);
    }


    @When("^Нажат пункт Страхование путешественников")
    public void selectIncuranceTravelers(){
        travelersSteps.newTravelers();
    }

    @When("^Выбираем полис - Минимальная\"(.*)\"$")
    public void selectPolice(String police){
        policeSteps.selectPolice(police);
    }
    @When("^Кликнули на кнопку Оформить\"(.*)\"$")
    public void clickOrder(String order){
        policeSteps.selectOrder(order);
    }

    @When("^Заполняем форму для страхования")
    public void fullField(){
        orderingSteps.orderIncuranceTravelers();
    }
}
