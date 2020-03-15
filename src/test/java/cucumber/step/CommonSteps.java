package cucumber.step;

import helper.CommonHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonSteps {
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = CommonHelper.loadWebDriver();

    }

    @After
    public void tearDown() {
        //if(driver!=null){
        //   driver.quit();
        // }

    }

    public static WebDriver getDriver() {
        return driver;
    }

    @Given("Navigate to 'Automation Practice' site.")
    public void navigate_to_site() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        // WebDriver driver = CommonHelper.loadWebDriver();
        driver.get(CommonHelper.getEnvironmentProperty("app.url"));
    }
}
