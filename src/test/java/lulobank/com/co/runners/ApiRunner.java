package lulobank.com.co.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//import static co.com.restapiexample.utilities.Enums.Excepciones.ERROR_RUNNER;

@CucumberOptions(
        features = "src/test/resources/features/consultar_api.feature",
        glue = {"lulobank.com.co.stepdefinitions","lulobank.com.co.setup"},
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)



public class ApiRunner {
}
