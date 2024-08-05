package co.com.konex.automation.test.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Task {

    private PageObject pageObject;

    public AbrirNavegador(PageObject pageObject) {
        this.pageObject = pageObject;
    }

    /**
     *
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(pageObject));
    }
    public static AbrirNavegador at(PageObject pageObject){return instrumented(AbrirNavegador.class, pageObject);}
}
