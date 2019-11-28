package tcb.anhtt23.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com/")
public class GoToGooglePage extends PageObject {

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    WebElement inputText;

    @Step
    public void openURL() {
        getDriver().getCurrentUrl();
    }

    @Step
    public void inputText(String text) {
    }
}
