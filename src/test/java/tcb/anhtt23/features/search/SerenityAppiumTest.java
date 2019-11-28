package tcb.anhtt23.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tcb.anhtt23.steps.LoginSteps;

@RunWith(SerenityRunner.class)
@WithTag(type = "test appium")
public class SerenityAppiumTest {
    @Managed(driver = "Appium")
    WebDriver webDriver;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void testLogin() {
        loginSteps.openApp();
    }

    public void assertTest() {
        loginSteps.checkIcondisplay();
    }

    public void TestJunit() {
        loginSteps.openApp();
    }
}
