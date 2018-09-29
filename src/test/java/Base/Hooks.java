package Base;
/**
 * Created by Sam.Gnanarathne on 28/09/2018.
 */

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Common {
	
	@Before
	public void beforeScenario() {
		System.out.println("--scenrio starting---");
	}
	
	
	@After
	public void AfterScenario() {
		System.out.println("--scenrio End---");
	}

}
