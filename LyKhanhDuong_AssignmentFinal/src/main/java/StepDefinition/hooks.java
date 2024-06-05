package StepDefinition;

import Core.AppiumBase;
import Function.Common;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;
import java.net.MalformedURLException;

public class hooks extends AppiumBase {
    @Before
    public void beforeHooks() throws MalformedURLException {
        System.out.println("This is beforeHooks");
//        setup();
    }
    @After
    public void afterHooks(Scenario scenario) throws IOException {
        Common common = new Common();
        System.out.println("This is afterHooks");
        if (scenario.isFailed()) {
            System.out.println("This is testcase failed");
//            common.capturingScreenshots("calculator.png");
        }
        teardown();
    }

}