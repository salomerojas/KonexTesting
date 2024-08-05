package co.com.konex.automation.test.questions;

import co.com.konex.automation.test.userinterface.WikipediaHome;
import co.com.konex.automation.test.userinterface.YoutubeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCuenta implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        if(YoutubeHome.VALIDAR_CUENTA.resolveFor(actor).isPresent()){
            return true;
        }
        return false;
    }
    public static ValidacionCuenta withTwoStep(){
        return new ValidacionCuenta();
    }
    }

