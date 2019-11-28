package tcb.anhtt23.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import tcb.anhtt23.steps.TravellerSteps;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

@RunWith(SerenityRunner.class)
public class TestSerenity {
    @Managed(driver = "chrome")
    WebDriver webDriver;

    @Steps
    TravellerSteps travellerSteps;

    @Test
    public void shouldCalculatePointsBasedOnDistance() {
        // GIVEN
        travellerSteps.a_traveller_has_a_frequent_flyer_account_with_balance(10000);

        // WHEN
        travellerSteps.the_traveller_flies(1000);

        // THEN
        travellerSteps.traveller_should_have_a_balance_of(10100);
    }

    @Test
    public void testOpenGoogle() {
        System.setProperty("webdriver.chrome.driver", "F:\\AutomationTest\\ChromeDriver\\chromeDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://www.google.com");
        webDriver.findElement(By.name("q")).sendKeys("firefly", Keys.ENTER);

        new WebDriverWait(webDriver, 5).until(titleContains("Google Search"));

        Assert.assertEquals(webDriver.getTitle(), "firefly - Google Search");
    }

    @Test
    @Pending
    public void testPending() {
        System.out.println("test Pending");
    }
}
