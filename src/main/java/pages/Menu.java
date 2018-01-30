package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import steps.MenuSteps;

/**
 * Created by Новруз on 25.01.2018.
 */
public class Menu extends BaseClass{

    @FindBy(xpath = "(//div[@class = 'alt-menu-mid'])[1]")
    WebElement mainItem;

    @FindBy(xpath = "(//div[@class = 'alt-menu-collapser__hidder'])[5]")
    WebElement subMainItem;

    public Menu(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectMenu (String nameItem){
        mainItem.findElement(By.xpath("(//span[contains(text(), '"+nameItem+"')])[1]")).click();
    }
    public void selectSubMenu (String nameItem2){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class = 'alt-menu-collapser__hidder'])[5]"))));
        subMainItem.findElement(By.xpath("(//a[contains (text(), '"+nameItem2+"')])[1]")).click();

    }

    public Menu(){
        PageFactory.initElements(MenuSteps.getDriver(), this);
    }

}
