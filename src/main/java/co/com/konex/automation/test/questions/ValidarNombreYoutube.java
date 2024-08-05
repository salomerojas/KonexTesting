package co.com.konex.automation.test.questions;

import co.com.konex.automation.test.userinterface.YoutubeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidarNombreYoutube implements Question<Boolean>{
    String validarNombre;

    public ValidarNombreYoutube(String validarNombre) {
        this.validarNombre = validarNombre;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Visibility.of(YoutubeHome.VALIDAR_CANCION).answeredBy(actor);
        validarNombre=YoutubeHome.VALIDAR_CANCION.resolveFor(actor).getText();
        return (validarNombre.contains("Locked Out Of Heaven"));
    }
    public static ValidarNombreYoutube con(String validarNombre){
        return new ValidarNombreYoutube(validarNombre);
    }
}
