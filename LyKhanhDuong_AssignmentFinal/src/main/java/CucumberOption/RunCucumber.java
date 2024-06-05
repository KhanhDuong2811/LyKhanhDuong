package CucumberOption;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,

        monochrome = true,
        //duong dan file feature
//        features = {"classpath:src/main/java/Day5/Resource/LoginFB.feature"},
        features = "src/main/java/Resource/Shopiness.feature",
        //ten folder cua step definition
        glue = "StepDefinition",
        // tag muon Run
        tags = "@Shoppiness_TC_01",
        plugin = {
                "junit:target/reports/cucumber.xml",
        }
)
public class RunCucumber {
    private TestNGCucumberRunner testNGCucumberRunner;
    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        System.out.println("This is steps : setUpClass");
    }
    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
        testNGCucumberRunner.runScenario(pickle.getPickle());
        System.out.println("This is steps : scenario");
    }
    @DataProvider
    public Object[][] scenarios() {
        System.out.println("This is steps : DataProvider");
        return testNGCucumberRunner.provideScenarios();

    }
    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
        System.out.println("This is steps : tearDownClass");
    }

}
