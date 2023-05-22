package e2e.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainStep {

    @When("^the client calls /version$")
    public void the_client_issues_GET_version() throws Throwable {
     //   executeGet("http://localhost:8080/version");
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
//        HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
//        assertThat("status code is incorrect : "+
//                latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
    //    assertThat(latestResponse.getBody(), is(version));
    }
}
