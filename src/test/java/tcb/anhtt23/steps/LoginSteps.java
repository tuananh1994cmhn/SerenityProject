package tcb.anhtt23.steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import tcb.anhtt23.pages.LoginScreen;

public class LoginSteps extends ScenarioSteps {

    LoginScreen onScreen;

    @Step("open App ")
    @Title("open app and check if BtnAllow display => click")
    public void openApp() {
        System.out.println("open app");
        if (onScreen.checkAllowButtonDisplay() == true) {
            onScreen.clickAllowButton();
        }
        Assert.assertTrue(onScreen.checkIconHambugerDisplay());
    }

    @Step
    @Title("verify icon display")
    public void checkIcondisplay() {
        Assert.assertTrue(onScreen.checkIconPlanMode());
    }
}
