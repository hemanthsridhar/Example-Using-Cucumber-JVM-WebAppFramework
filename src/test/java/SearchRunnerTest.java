import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by hemanthsridhar on 9/23/16.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", tags = "@search",
        format = {"pretty","html:target/cucumber/","json:target/cucumber.json"})
public class SearchRunnerTest {

}
