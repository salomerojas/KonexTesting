package co.com.konex.automation.test.task;

import co.com.konex.automation.test.exceptions.ApplicationException;
import co.com.konex.automation.test.userinterface.YoutubeHome;
import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.annotations.Step;

public class IngresarCuentaYoutube implements Task, IsSilent {
    private  String user;
    private  String pass;

    /**
     * Este método nos ayuda a ingresar a nuestra cuenta de youtube, con un usuario y contraseña dados por consola
     *
     *
     */

    @Override
    @Step("{0} goes to enter the credentials")
    public <T extends Actor> void performAs(T actor) {
        try{
        credentials(actor);
        actor.attemptsTo(Click.on(YoutubeHome.BOTON_ACCESO),
                Enter.theValue(user).into(YoutubeHome.INPUT_USUARIO).thenHit(Keys.ENTER),
                Enter.theValue(pass).into(YoutubeHome.INPUT_CONTRASENA).thenHit(Keys.ENTER));
        }catch (Exception e){
            throw new ApplicationException(ApplicationException.MESSAGE_FAILED_LOGIN, e);
        }
    }
    public <T extends Actor> void credentials(T actor) {
        user = System.getProperty("user");
        pass = System.getProperty("pass");
    }
    public static IngresarCuentaYoutube conCredenciales(){
        return instrumented(IngresarCuentaYoutube.class);
    }
}
