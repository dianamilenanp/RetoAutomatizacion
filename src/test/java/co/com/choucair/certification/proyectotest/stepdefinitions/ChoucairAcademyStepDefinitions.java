package co.com.choucair.certification.proyectotest.stepdefinitions;

import co.com.choucair.certification.proyectotest.model.AcademyChoucairData;
import co.com.choucair.certification.proyectotest.questions.Answer;
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
        OnStage.theActorCalled("Pedro").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fills out the form$")
    public void heFillsOutTheForm(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.the(
                academyChoucairData.get(0).getStrFirstName(),
                academyChoucairData.get(0).getStrLastName(),
                academyChoucairData.get(0).getStrEmail(),
                academyChoucairData.get(0).getStrMonth(),
                academyChoucairData.get(0).getStrDay(),
                academyChoucairData.get(0).getStrYear(),
                academyChoucairData.get(0).getStrPassword(),
                academyChoucairData.get(0).getStrConfirmPassword(),
                academyChoucairData.get(0).getBooTerms(),
                academyChoucairData.get(0).getBooPolicy()
                ));
    }

    @Then("^he can enter the page$")
    public void heCanEnterThePage(List<AcademyChoucairData> academyChoucairData)throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrfinalRegistration())));

    }

}
