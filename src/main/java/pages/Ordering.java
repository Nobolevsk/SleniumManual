package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.OrderingSteps;

/**
 * Created by Новруз on 25.01.2018.
 */
public class Ordering extends BaseClass {

    @FindBy(name = "insured0_surname")
    WebElement surname1;

     @FindBy(name = "insured0_name")
    WebElement name1;

     @FindBy(name = "insured0_birthDate")
    WebElement birthDate1;

     @FindBy(name = "surname")
    WebElement surname2;

     @FindBy(name = "name")
    WebElement name2;

     @FindBy(name = "middlename")
    WebElement middlename;

     @FindBy(name = "birthDate")
    WebElement birthDate2;

     @FindBy(name = "passport_series")
    WebElement passport_series;

     @FindBy(name = "passport_number")
    WebElement passport_number;

     @FindBy(name = "issueDate")
    WebElement issueDate;

     @FindBy(name = "issuePlace")
    WebElement issuePlace;


    public Ordering (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void Inputs(){
        surname1.sendKeys("Петров");
        name1.sendKeys("Кирилл");
        birthDate1.sendKeys("12.12.1990");
        surname2.sendKeys("Иванов");
        name2.sendKeys("Иван");
        middlename.sendKeys("Иванович");
        birthDate2.sendKeys("22.02.1988");
        passport_series.sendKeys("1111");
        passport_number.sendKeys("123456");
        issueDate.sendKeys("12122012");
        issuePlace.sendKeys("Там");
    }


    public Ordering(){
        PageFactory.initElements(OrderingSteps.getDriver(), this);
    }

}
