package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import steps.InsuranceTravelersSteps;


/**
 * Created by Новруз on 25.01.2018.
 */
public class InsuranceTravelers extends BaseClass {

    @FindBy(xpath = "//h1[text() = 'Страхование путешественников']")
    WebElement title;

    public InsuranceTravelers(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void orderOnline(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//h1[text() = 'Страхование путешественников']"))));
        title.findElement(By.xpath("(//a[@href = 'https://online.sberbankins.ru/store/vzr/index.html'])/*")).click();
    }

    public InsuranceTravelers(){
        PageFactory.initElements(InsuranceTravelersSteps.getDriver(), this);
    }

}
