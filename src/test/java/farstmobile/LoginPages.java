package farstmobile;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPages extends PageObject {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[1]/android.widget.EditText")
    WebElement id_Username;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.widget.EditText")
    WebElement id_Password;

    private By xpathBtnContinue = By.xpath("sddadsf");

    void clickButonContinue() {
        if (!element(xpathBtnContinue).isDisplayed()) {
            return;
        }
        element(xpathBtnContinue).click();
    }

    public void inputUsername(String user) {
        element(id_Username).typeAndEnter(user);
    }

    public void inputPassword(String pw) {
        id_Password.sendKeys(pw);
    }
}
