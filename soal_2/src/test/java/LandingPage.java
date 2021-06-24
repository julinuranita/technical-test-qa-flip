import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LandingPage {

    @Steps
    LandingPageSteps landingPageSteps;

    @Given("User open url flip id")
    public void user_open_url_flip_id() {
        landingPageSteps.openFlipID();
    }

    @Then("{string} button is displayed")
    public void button_is_displayed(String buttonName) {
        landingPageSteps.buttonIsDisplayed(buttonName);
    }

    @When("User click {string} button")
    public void user_click_button(String buttonName) {
        landingPageSteps.clickMenuButton(buttonName);
    }
}
