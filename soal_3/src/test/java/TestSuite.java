import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-parallel/report.json","pretty"},
        features = {
                "src/test/resources/features/User.feature"
        })
public class TestSuite {
}
