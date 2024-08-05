package co.com.konex.automation.test.task;

import co.com.konex.automation.test.exceptions.ApplicationException;
import co.com.konex.automation.test.userinterface.YoutubeHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class BusquedaCancion implements Task {
    String nombre;

    public BusquedaCancion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.keyValues(nombre).into(YoutubeHome.INPUT_BUSQUEDA).thenHit(Keys.ENTER),
                    Click.on(YoutubeHome.ELEGIR_CANCION));
        }catch (Exception e){
            throw new ApplicationException(ApplicationException.MESSAGE_FAILED_GET_INFORMATION, e);
        }
    }
    public static BusquedaCancion conNombre(String nombre){return instrumented(BusquedaCancion.class,nombre);}
}
