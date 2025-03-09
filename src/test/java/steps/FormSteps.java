package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class FormSteps {

    @Before("set up browser")
    public void setUp(){}

    @When("the user navigate to the form")
    public void userNavigatesTo() {}

    @And("the user fill the form with his personal data")
    public void userCompletesTheForm(){}

    @Then("the user send the form")
    public void submitTheForm(){}

    @After("tear down")
    public void tearDown(){}

}
