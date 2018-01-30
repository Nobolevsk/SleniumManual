package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import steps.BaseStepsForTest;


/**
 * Created by Новруз on 25.01.2018.
 */
public class ChoosePolice extends BaseClass {

    @FindBy(xpath = "(//div[@class = 'b-form-box-block'])[1]")
    WebElement min;

    @FindBy(xpath = "//span[@class = 'b-button-block-center']")
    WebElement order;


    public ChoosePolice(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    public void minimalnaya(String nameOfPolice){
        for (String window2 :
                driver.getWindowHandles()) {
            driver.switchTo().window(window2);
        }
        WebElement minimal = driver.findElement(By.xpath("//*[text() = 'Минимальная']"));
        wait.until(ExpectedConditions.visibilityOf(minimal));
        min.findElement(By.xpath("//*[text() = '"+nameOfPolice+"']")).click();
    }

    public void orderItem(String clickOrder){
        order.findElement(By.xpath("//span[text() = '"+clickOrder+"']")).click();
    }

    public ChoosePolice() {
        PageFactory.initElements(BaseStepsForTest.getDriver(), this);
    }

}
