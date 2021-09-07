package co.com.choucair.certification.proyectotest.tasks;

import co.com.choucair.certification.proyectotest.userinterface.ChoucairsHomePage;
import co.com.choucair.certification.proyectotest.userinterface.ChoucairsRegisterPage;
import co.com.choucair.certification.proyectotest.userinterface.ChoucairsDevicesPage;
import co.com.choucair.certification.proyectotest.userinterface.ChoucairsLocationPage
import co.com.choucair.certification.proyectotest.userinterface.ChoucairsFinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

public class RegisterUser implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strSystem;
    private String strPassword;
    private Boolean booTerms;
    private Boolean booPolicy;

    public RegisterUser(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strSystem, String strPassword, Boolean booTerms, Boolean booPolicy) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strSystem = strSystem;
        this.strPassword = strPassword;
        this.booTerms = booTerms;
        this.booPolicy = booPolicy;
    }

    public static RegisterUser onThePage(String strFirstName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String strSystem, String strPassword, Boolean booTerms, Boolean booPolicy)  {
        return Tasks.instrumented(
                RegisterUser.class,strFirstName,strLastName,strEmail,strMonth,strDay,strYear,strComputer,strVersion,strLanguage,strMobile,strModel,strSystem,strPassword,booTerms,booPolicy);
    }

   @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairsHomePage.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(ChoucairsRegisterPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(ChoucairsRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(ChoucairsRegisterPage.INPUT_EMAIL),
                Enter.theValue(strMonth).into(ChoucairsRegisterPage.SELECT_MONTH),
                Enter.theValue(strDay).into(ChoucairsRegisterPage.SELECT_DAY),
                Enter.theValue(strYear).into(ChoucairsRegisterPage.SELECT_YEAR),
                Click.on(ChoucairsRegisterPage.BUTTON_PAGE_LOCATION),
                Click.on(ChoucairsLocationPage.LOCATION_BUTTON),

                Enter.theValue(strComputer).into(ChoucairsDevicesPage.SELECT_COMPUTER),
                Enter.theValue(strVersion).into(ChoucairsDevicesPage.SELECT_VERSION),
                Enter.theValue(strLanguage).into(ChoucairsDevicesPage.SELECT_LANGUAGE),
                Enter.theValue(strMobile).into(ChoucairsDevicesPage.SELECT_MOBILE),
                Enter.theValue(strModel).into(ChoucairsDevicesPage.SELECT_MODEL),
                Enter.theValue(strSystem).into(ChoucairsDevicesPage.SELECT_SYSTEM),
                Click.on(ChoucairsDevicesPage.FINAL_BUTTON),

                Enter.theValue(strPassword).into(ChoucairsFinalPage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(ChoucairsFinalPage.INPUT_CONFIRM_PASSWORD),
                Click.on(ChoucairsFinalPage.CHECK_TERMS),
                Click.on(ChoucairsFinalPage.CHECK_PRIVACY_POLICY),
                Click.on(ChoucairsFinalPage.BUTTON_COMPLETE_SETUP)
        );
    }

}
