package co.com.konex.automation.test.questions;

import co.com.konex.automation.test.userinterface.WikipediaHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTextoWikipedia implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        if(WikipediaHome.VALIDAR_TEXTO.resolveFor(actor).isPresent()){
            return true;
        }
        return false;
    }
    public static ValidarTextoWikipedia conPalabra(){
        return new ValidarTextoWikipedia();
    }
}
