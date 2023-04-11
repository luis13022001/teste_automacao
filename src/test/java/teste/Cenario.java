package teste;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty.html",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "timeline:target/test-output-thread/"
},
        features = "src/test/resources/features", tags = "@CT001_ValidacaoEspecificacoes",
        glue = "", monochrome = true, dryRun = false)

public class Cenario {
    public static void test() throws Exception {

    }
}
