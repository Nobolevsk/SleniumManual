import Utils.BaseForTest2;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.*;

/**
 * Created by Новруз on 19.01.2018.
 */

public class Test2 extends BaseForTest2 {

    @Test
    public void newTestSberInsurance() {

        //Нажимаем на меню "Застраховать себя и имущество"

        Menu menu = new Menu(driver);

        menu.selectMenu("Застраховать себя");


        //Нажимаем на "Страхование путешественников"
        menu.selectSubMenu("Страхование путешественников");

        //Проверяем наличие на странице заголовка "Страхование путешественников" и Нажать на – Оформить Онлайн
        InsuranceTravelers travelers = new InsuranceTravelers(driver);
        travelers.orderOnline();

        //На вкладке "Выбор полиса" выбираем сумму страховой защиты – Минимальная
        ChoosePolice choosePolice = new ChoosePolice(driver);
        choosePolice.minimalnaya("Минимальная");

        //Нажимаем "Оформить"
        choosePolice.orderItem("Оформить");

        //На вкладке "Оформить" заполняем поля
        Ordering ordering = new Ordering(driver);
        ordering.Inputs("fff");

        //Нажимаем "Продолжить"
        driver.findElement(By.xpath("//span[@class = 'b-continue-btn']")).click();

        //Проверяем, что появилось сообщение - Заполнены не все обязательные поля
        Assert.assertEquals("Заполнены не все обязательные поля", driver.findElement(By.xpath("//div[text() = 'Заполнены не все обязательные поля']")).getText());


    }

}
