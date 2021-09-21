package co.com.choucair.certification.proyectotest.tasks;

import co.com.choucair.certification.proyectotest.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterUser implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strPassword;
    private String strConfirmPassword;
    private Boolean booTerms;
    private Boolean booPolicy;

    public RegisterUser(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPassword, String strConfirmPassword, Boolean booTerms, Boolean booPolicy) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
        this.booTerms = booTerms;
        this.booPolicy = booPolicy;
    }

    public static RegisterUser the(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strPassword, String strConfirmPassword, Boolean booTerms, Boolean booPolicy)  {
        return Tasks.instrumented(
                RegisterUser.class,strFirstName,strLastName,strEmail, strMonth,strDay,strYear,strPassword,strConfirmPassword,booTerms,booPolicy);
    }

   @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairsHomePage.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(ChoucairsRegisterPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(ChoucairsRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(ChoucairsRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(ChoucairsRegisterPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(ChoucairsRegisterPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(ChoucairsRegisterPage.SELECT_YEAR),
                Click.on(ChoucairsRegisterPage.BUTTON_PAGE_LOCATION),
                Click.on(ChoucairsLocationPage.LOCATION_BUTTON),
                Click.on(ChoucairsDevicesPage.FINAL_BUTTON),
                Enter.theValue(strPassword).into(ChoucairsFinalPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(ChoucairsFinalPage.INPUT_CONFIRM_PASSWORD),
                Click.on(ChoucairsFinalPage.CHECK_TERMS),
                Click.on(ChoucairsFinalPage.CHECK_PRIVACY_POLICY),
                Click.on(ChoucairsFinalPage.BUTTON_COMPLETE_SETUP)
        );
    }

}
