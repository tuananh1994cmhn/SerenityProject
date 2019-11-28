package farstmobile;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Test login F@rst mobile
 *
 * @author TuanAnh
 */
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "data/login.csv")
public class LoginFeature extends ObjectLogin {

    @Steps
    LoginSteps loginSteps;

    @Test
    public void testLogin() throws InterruptedException {
        System.out.println("testLogin");
        loginSteps.doLogin(getUsername(), getPw());
    }

}
