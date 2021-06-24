import net.thucydides.core.steps.ScenarioSteps;

public class LandingPageSteps extends ScenarioSteps {

    LandingPagePages landingPagePages;

    public void openFlipID(){
        landingPagePages.open();
    }

    public void buttonIsDisplayed(String buttonName){
        landingPagePages.validateButtonIsDisplayed(buttonName);
        System.out.println("Button Is Displayed");
    }

    public void clickMenuButton(String buttonName){
        landingPagePages.clickMenuButton(buttonName);
        System.out.println("Button already clicked");
    }
}
