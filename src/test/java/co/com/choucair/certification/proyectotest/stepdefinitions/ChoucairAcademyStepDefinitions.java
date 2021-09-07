package co.com.choucair.certification.proyectotest.stepdefinitions;

import co.com.choucair.certification.proyectotest.tasks.OpenUp;
import co.com.choucair.certification.proyectotest.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that Pedro wants register on the page Utest\\.com$")
    public void thatPedroWantsRegisterOnThePageUtestCom() {
        OnStage.theActorCalled("Pedro").wasAbleTo(OpenUp.thePage(),(RegisterUser.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));
    }

    @When("^he enters the requested data$")
    public void heEntersTheRequestedData() {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he can enter the page$")
    public void heCanEnterThePage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

    }


}
