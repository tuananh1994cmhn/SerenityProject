package tcb.anhtt23.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("google.com.vn")
public class LoginScreen extends PageObject {

    @AndroidFindBy(id = "android:id/button1")
    WebElement btAllow;

    @AndroidFindBy(id = "android:id/button2")
    WebElement btDontAllow;

    @AndroidFindBy(accessibility = "Navigate up")
    WebElement hambugerIcon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")
    WebElement iconPlanMode;

    public boolean checkAllowButtonDisplay() {
        return btAllow.isDisplayed();
    }

    public void clickAllowButton() {
        btAllow.click();
    }

    public boolean checkAllowButonDisplay() {
        return btAllow.isDisplayed();
    }

    public boolean checkIconHambugerDisplay() {
        return hambugerIcon.isDisplayed();
    }

    public boolean checkIconPlanMode() {
        return iconPlanMode.isDisplayed();
    }

    public void openUrl() {
        getDriver().getCurrentUrl();
    }
}
