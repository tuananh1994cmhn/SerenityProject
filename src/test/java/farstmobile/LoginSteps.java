package farstmobile;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
    LoginPages loginPages;

    @Step("click Continue button")
    public LoginSteps clickButonContinue() {
        loginPages.clickButonContinue();
        return this;
    }

    @Step("input Username")
    public LoginSteps inputUsername(String user) throws InterruptedException {
        loginPages.inputUsername(user);
        return this;
    }

    @Step("input pw")
    public LoginSteps inputPassword(String pw) {
        loginPages.inputPassword(pw);
        return this;
    }

    @Step("Do login")
    public void doLogin(String username, String pw) throws InterruptedException {
        System.out.println("doLogin");
        inputUsername(username).inputPassword(pw);
        Thread.sleep(1000);
        Serenity.takeScreenshot();
    }

}
