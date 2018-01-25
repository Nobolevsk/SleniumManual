import org.junit.*;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Новруз on 19.01.2018.
 */

public class SberInsuranceTest {
    private WebDriver driver;
    private String Url;


    @Before
    @Ignore
    public void start(){
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");

        driver = new ChromeDriver();
        Url = "http://www.sberbank.ru/ru/person";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Url);
    }


    @Test
    @Ignore
    public void testSberInsurance() {
        //Нажимаем на меню "Застраховать себя и имущество"
        driver.findElement(By.xpath("(//SPAN[@class='multiline'])[5]")).click();

        //Нажимаем на "Страхование путешественников"
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        Wait<WebDriver> wait = new WebDriverWait(driver,5);
        WebElement submenu = driver.findElement(By.xpath("(//div[@class = 'alt-menu-collapser__hidder'])[5]"));
        wait.until(ExpectedConditions.visibilityOf(submenu));
        driver.findElement(By.xpath("(//a[contains (text(), 'Страхование путешественников')])[1]")).click();

        //Проверяем наличие на странице заголовка – Страхование путешественников
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement title = driver.findElement(By.xpath("//h1[text()='Страхование путешественников']"));
        Assert.assertEquals("Страхование путешественников", title.getText());

        //Нажать на – Оформить Онлайн
        driver.findElement(By.xpath("(//a[@href = 'https://online.sberbankins.ru/store/vzr/index.html'])/*")).click();

        //На вкладке "Выбор полиса" выбираем сумму страховой защиты – Минимальная
        for (String window2 :
                driver.getWindowHandles()) {
            driver.switchTo().window(window2);
        }
        WebElement minimal = driver.findElement(By.xpath("//*[text() = 'Минимальная']"));
        wait.until(ExpectedConditions.visibilityOf(minimal));
        driver.findElement(By.xpath("//*[text() = 'Минимальная']")).click();

        //Нажимаем "Оформить"
        driver.findElement(By.xpath("//span[text() = 'Оформить']")).click();

        //На вкладке "Оформить" заполняем поля
        driver.findElement(By.xpath("//input[@name = 'insured0_surname']")).sendKeys("Veliiev");
        driver.findElement(By.xpath("//input[@name = 'insured0_name']")).sendKeys("Novruz");
        driver.findElement(By.xpath("//input[@name = 'insured0_birthDate']")).sendKeys("23031991");
        driver.findElement(By.xpath("//input[@name = 'surname']")).sendKeys("Петров");
        driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("Иван");
        driver.findElement(By.xpath("//input[@name = 'middlename']")).sendKeys("Иванович");
        driver.findElement(By.xpath("//input[@name = 'birthDate']")).sendKeys("20121989");
        driver.findElement(By.xpath("//input[@name = 'passport_series']")).sendKeys("1111");
        driver.findElement(By.xpath("//input[@name = 'passport_number']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name = 'issueDate']")).sendKeys("12122012");
        driver.findElement(By.xpath("//textarea[@name = 'issuePlace']")).sendKeys("Где-то далеко-далеко");

        //Проверяем, что все данные заполнены правильно
        Assert.assertEquals("Veliiev", driver.findElement(By.name("insured0_surname")).getAttribute("value"));
        Assert.assertEquals("Novruz", driver.findElement(By.name("insured0_name")).getAttribute("value"));
        Assert.assertEquals("23.03.1991", driver.findElement(By.name("insured0_birthDate")).getAttribute("value"));
        Assert.assertEquals("Петров", driver.findElement(By.name("surname")).getAttribute("value"));
        Assert.assertEquals("Иван", driver.findElement(By.name("name")).getAttribute("value"));
        Assert.assertEquals("Иванович", driver.findElement(By.name("middlename")).getAttribute("value"));
        Assert.assertEquals("20.12.1989", driver.findElement(By.name("birthDate")).getAttribute("value"));
        Assert.assertEquals("1111", driver.findElement(By.name("passport_series")).getAttribute("value"));
        Assert.assertEquals("123456", driver.findElement(By.name("passport_number")).getAttribute("value"));
        Assert.assertEquals("12.12.2012", driver.findElement(By.name("issueDate")).getAttribute("value"));
        Assert.assertEquals("Где-то далеко-далеко", driver.findElement(By.name("issuePlace")).getAttribute("value"));

        //Нажимаем "Продолжить"
        driver.findElement(By.xpath("//span[@class = 'b-continue-btn']")).click();

        //Проверяем, что появилось сообщение - Заполнены не все обязательные поля
        Assert.assertEquals("Заполнены не все обязательные поля", driver.findElement(By.xpath("//div[text() = 'Заполнены не все обязательные поля']")).getText());


    }


    @After
    @Ignore
    public void Shutup(){
        driver.quit();
    }

}
