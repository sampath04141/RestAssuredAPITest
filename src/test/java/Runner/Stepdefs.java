package Runner;

/**
 * Created by Sam.Gnanarathne on 28/09/2018.
 */
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.junit.Assert;

import Base.Common;

public class Stepdefs extends Common {

	@Given("^I call API endpoint \"([^\"]*)\"$")
	public void i_call_API_endpoint(String resource) {
		request(resource);
	}

	@Then("^I can see \"([^\"]*)\"$")
	public void i_can_see(String expectedResult) {
		Assert.assertEquals(response.getStatusCode(), Integer.parseInt(expectedResult));
	}

	@Then("^the current \"([^\"]*)\"$")
	public void the_current(String format) {
		Assert.assertEquals(format, jsonResponse.getString("format"));
	}

	@Then("^available \"([^\"]*)\"$")
	public void available(String label) {
		Assert.assertEquals(label, jsonResponse.getJSONObject("result").getString("label"));
	}

}