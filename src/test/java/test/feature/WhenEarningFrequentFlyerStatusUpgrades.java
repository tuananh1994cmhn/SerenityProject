package test.feature;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import test.object.Status;
import test.page.GooglePage;
import test.step.TravellerStatusSteps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "F:\\AutomationTest\\Serenity\\SerenityProject\\src\\test\\resources\\data.csv")
public class WhenEarningFrequentFlyerStatusUpgrades {
    @Managed
    WebDriver driver;
    private int kilometersTravelled;
    private String expectedStatus;

    public void setKilometersTravelled(int kilometersTravelled) {
        this.kilometersTravelled = kilometersTravelled;
    }

    public void setExpectedStatus(String expectedStatus) {
        this.expectedStatus = String.valueOf(expectedStatus);
    }

    @Qualifier
    public String qualifier() {
        return kilometersTravelled + "=>" + expectedStatus;
    }

    @Steps
    TravellerStatusSteps travellerSteps;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("platformVersion", "10.3");
        capabilities.setCapability("app", "sauce-storage:tw_mobile.zip");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("appiumVersion", "1.6.5");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void reallyhouldEarnNextStatusWithEnoughPoints() {
        // GIVEN
        travellerSteps.a_traveller_joins_the_frequent_flyer_program();

        // WHEN
        travellerSteps.the_traveller_flies(kilometersTravelled);

        // THEN
        travellerSteps.traveller_should_have_a_status_of(expectedStatus);
    }
}
