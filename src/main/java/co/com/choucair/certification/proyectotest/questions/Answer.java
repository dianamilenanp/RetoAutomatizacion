package co.com.choucair.certification.proyectotest.questions;

import co.com.choucair.certification.proyectotest.userinterface.ChoucairsFinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String finishRegistration= Text.of(ChoucairsFinalPage.BUTTON_COMPLETE_SETUP).viewedBy(actor).asString();
        if (question.equals(finishRegistration)){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
