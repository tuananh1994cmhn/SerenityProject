package tcb.anhtt23.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tcb.anhtt23.steps.GoToGoogleStep;

@RunWith(SerenityRunner.class)
public class GoToGoogle {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    GoToGoogleStep goToGoogleStep;

    @Test()
    public void openURL() {
        goToGoogleStep.openURL();
    }

    @Test()
    @Pending
    public void inputTextToSearch() {
        goToGoogleStep.inputText("test");
    }

}
