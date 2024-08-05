package co.com.konex.automation.test.task;

import co.com.konex.automation.test.exceptions.ApplicationException;
import co.com.konex.automation.test.userinterface.WikipediaHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Buscamos en wikipedia el texto que queramos trayendo el valor desde la bateria depruebas.
 */
public class BusquedaWikipedia implements Task {
    String palabraBusqueda;
    public BusquedaWikipedia(String palabraBusqueda) {
        this.palabraBusqueda = palabraBusqueda;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(palabraBusqueda).into(WikipediaHome.CAMPO_BUSQUEDA).thenHit(Keys.ENTER),
                    Scroll.to(WikipediaHome.VALIDAR_TEXTO));
        }catch (Exception e){
            throw new ApplicationException(ApplicationException.MESSAGE_FAILED_GET_INFORMATION, e);
        }
    }
    public static BusquedaWikipedia para(String palabraBusqueda){return instrumented(BusquedaWikipedia.class,palabraBusqueda);}
}
