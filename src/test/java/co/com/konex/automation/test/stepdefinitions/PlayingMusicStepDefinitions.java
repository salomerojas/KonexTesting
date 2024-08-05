package co.com.konex.automation.test.stepdefinitions;

import co.com.konex.automation.test.questions.ValidacionCuenta;
import co.com.konex.automation.test.questions.ValidarNombreYoutube;
import co.com.konex.automation.test.task.AbrirNavegador;
import co.com.konex.automation.test.task.BusquedaCancion;
import co.com.konex.automation.test.task.IngresarCuentaYoutube;
import co.com.konex.automation.test.userinterface.YoutubePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class PlayingMusicStepDefinitions {
    @Managed()
    private WebDriver webdriver;
    private Actor userYoutube = Actor.named("User");
    private YoutubePage youtubePage;

    @Before
    public void setUpYoutube(){
        userYoutube.can(BrowseTheWeb.with(webdriver));
    }
    @Given("el usuario ingresa a la pagina principal de youtube")
    public void elUsuarioIngresaALaPaginaPrincipalDeYoutube() {
        userYoutube.wasAbleTo(AbrirNavegador.at(youtubePage));
    }

    /**
     *
     * @param nombre nombre de la canción
     */
    @When("el usuario le de click en buscar la cancion por su (.*)$")
    public void elUsuarioLeDeClickEnBuscarLaCancionPorSu(String nombre) {
        userYoutube.attemptsTo(BusquedaCancion.conNombre(nombre));

    }
    @Then("el usuario podra ver que el titulo en pantalla coincide con el (.*)$")
    public void elUsuarioPodraVerQueElTituloEnPantallaCoincideConEl(String nombreCancion) throws Exception{
        Thread.sleep(1000);
        userYoutube.should(seeThat(ValidarNombreYoutube.con(nombreCancion)));
    }
    @When("el usuario ingresa los datos del formulario")
    public void elUsuarioIngresaLosDatosDelFormulario() {
        userYoutube.attemptsTo(IngresarCuentaYoutube.conCredenciales());
    }
    @Then("el usuario podra ver la pantalla de validar cuenta")
    public void elUsuarioPodraVerLaPantallaDeValidarCuenta() {
        userYoutube.should(seeThat(ValidacionCuenta.withTwoStep()));
    }

}
