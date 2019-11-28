package tcb.anhtt23.steps;

import net.thucydides.core.annotations.Step;
import tcb.anhtt23.pages.GoToGooglePage;


public class GoToGoogleStep {
    GoToGooglePage googlePage;

    @Step
    public void openURL() {
        googlePage.openURL();
    }

    public void inputText(String text) {
        googlePage.inputText(text);
    }
}
