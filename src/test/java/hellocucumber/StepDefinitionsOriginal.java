package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitionsOriginal {

    @Given("I am logged in")
    public void i_am_logged_in() {
    }

    @When("I send a {string} request to {string}")
    public void i_send_a_request_to(String string, String string2) {
    }

    @When("I add the query string parameters:")
    public void i_add_the_query_string_parameters(io.cucumber.datatable.DataTable dataTable) {
    }

    @Then("I should receive a response with the status {int}")
    public void i_should_receive_a_response_with_the_status(Integer int1) {
    }

    @Then("I should receive a response within 1000ms")
    public void i_should_receive_a_response_within_1000ms() {
    }

    @Then("the response body json path at {string} should equal {string}")
    public void the_response_body_json_path_at_should_equal(String string, String string2) {
    }

}
