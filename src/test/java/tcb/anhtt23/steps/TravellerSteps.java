package tcb.anhtt23.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class TravellerSteps {

    @Step("Given a traveller has a frequent flyer account with {0} points")
    public void a_traveller_has_a_frequent_flyer_account_with_balance(int i) {
        System.out.println("a_traveller_has_a_frequent_flyer_account_with_balance");

    }

    @Step("When the traveller flies {0} km")
    public void the_traveller_flies(int i) {
        System.out.println("the_traveller_flies");
    }

    @Step("Then the traveller should have a balance of {0} points")
    public void traveller_should_have_a_balance_of(int i) {
        System.out.println("traveller_should_have_a_balance_of");
    }
}
