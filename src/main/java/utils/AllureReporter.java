package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

import static steps.BaseStepsForTest.driver;

/**
 * Created by Новруз on 27.01.2018.
 */
public class AllureReporter extends ru.yandex.qatools.allure.cucumberjvm.AllureReporter{


    @Override
    public void result(gherkin.formatter.model.Result result){
        if (result.getStatus().equals("failed")) {
            takeScreenshots();
        }
            super.result(result);
    }



    @Attachment(type = "image/png", value = "Скриншот при ошибке")
    public byte [] takeScreenshots (){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
