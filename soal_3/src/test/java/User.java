import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class User {
    @Steps
    UserSteps userSteps;

    @Given("I am on user management page")
    public void i_am_on_user_management_page() {
    }

    @When("I input list user data page")
    public void i_input_list_user_data_page() {
        userSteps.createUser();
    }

    @When("I click Send")
    public void i_click_send() {
    }

    @Then("I can see list of user personal data on the specified page")
    public void i_can_see_list_of_user_personal_data_on_the_specified_page() {
        userSteps.getSuccessCreatedUser();
        userSteps.validationJSONSchemaCreateUser();
    }

    @When("I enter name and job correctly")
    public void i_enter_name_and_job_correctly() {
        userSteps.getListUsersSuccess();
    }

    @Then("I can see a new user personal data successfully created")
    public void i_can_see_a_new_user_personal_data_successfully_created() {
        userSteps.validationJSONSchemaListUserSuccess();
    }
}
