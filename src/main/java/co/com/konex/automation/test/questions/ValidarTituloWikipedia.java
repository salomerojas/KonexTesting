package co.com.konex.automation.test.questions;

import co.com.konex.automation.test.userinterface.WikipediaHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarTituloWikipedia implements Question<String> {
    private String tituloWiki;

    public ValidarTituloWikipedia(String tituloWiki) {
        this.tituloWiki = tituloWiki;
    }

    @Override
    public String answeredBy(Actor actor) {
        return (Text.of(WikipediaHome.VALIDAR_TITULO.of(tituloWiki)).answeredBy(actor).toString());
    }
    public static ValidarTituloWikipedia delInicio(String tituloWiki){
        return new ValidarTituloWikipedia(tituloWiki);
    }

}
