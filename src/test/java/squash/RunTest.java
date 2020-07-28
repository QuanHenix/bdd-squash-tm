package squash;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author qtran - created on 21/07/2020
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/resources/squash/poc" })//"classpath:squash/239_demo-tc.feature" })
public class RunTest {
}
