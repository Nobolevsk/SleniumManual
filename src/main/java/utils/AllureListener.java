package utils;

import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.Allure;
import ru.yandex.qatools.allure.annotations.Attachment;

import static steps.BaseStepsForTest.driver;

/**
 * Created by Новруз on 27.01.2018.
 */
public class AllureListener extends ru.yandex.qatools.allure.junit.AllureRunListener {


    @Override
    public void testFailure(Failure failure) {
        takeScreenshots();
        super.testFailure(failure);
    }

    @Attachment(type = "image/png", value = "Скриншот при ошибке")
    public byte [] takeScreenshots (){
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
