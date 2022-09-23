package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import co.com.choucair.certification.model.DatosSaucedemo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;
import tasks.SignUp;

import java.util.List;

public class PruebaStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that I want to put into practice the knowledge of automation the login of a page$")
    public void thatIWantToPutIntoPracticeTheKnowledgeOfAutomationTheLoginOfAPage() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());

        // DriverRemote.withTheseOptions();
        //OnStage.theActorCalled("I").can(BrowseTheWeb.with(DriverRemote.on()));
    }

    @When("^enter the assigned username and password$")
    public void enterTheAssignedUsernameAndPassword(List<DatosSaucedemo> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SignUp.thepage()
                        .withThisUser(datos.get(0).getUsername())
                        .andThisPassword(datos.get(0).getPassword())

        );
    }

    @Then("^this will allow you to give access to available products$")
    public void thisWillAllowYouToGiveAccessToAvailableProducts() {

    }


}
