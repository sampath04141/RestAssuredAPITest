package Runner;
/**
 * Created by Sam.Gnanarathne on 28/09/2018.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true, 
		features = "src/test/resources/Features", 
		glue = "Runner",
		plugin = {
		"json:target/cucumber.json", "pretty:target/cucumber-pretty.txt" }, 
		tags = { "@checkBibliography" })

public class RunCucumberTest {
}