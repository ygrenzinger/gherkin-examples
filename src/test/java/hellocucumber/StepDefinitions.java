package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("{string} is logged in")
    public void persona_is_logged_in(String persona) {
    }

    @Given("{string} sort has been selected")
    public void sort_has_been_selected(String sortType) {
    }
    @Given("{string} filter has been selected")
    public void filter_has_been_selected(String filterType) {
    }
    @When("retrieving list of pets")
    public void retrieving_list_of_pets() {
    }

    @Then("the response is  received within {int} ms")
    public void the_response_is_received_within_some_time_in_ms(int time) {
    }

    @Then("there is the following pet types in this order:")
    public void there_is_the_following_pet_types_in_this_order(io.cucumber.datatable.DataTable dataTable) {
    }

}
