package co.com.konex.automation.test.stepdefinitions;

import co.com.konex.automation.test.questions.ValidarNombreYoutube;
import co.com.konex.automation.test.questions.ValidarTextoWikipedia;
import co.com.konex.automation.test.questions.ValidarTituloWikipedia;
import co.com.konex.automation.test.task.AbrirNavegador;
import co.com.konex.automation.test.task.BusquedaWikipedia;
import co.com.konex.automation.test.userinterface.WikipediaPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class WikipediaStepDefinitions {
    @Managed()
    private WebDriver webdriver;
    private Actor userWikipedia = Actor.named("User");
    private WikipediaPage wikipediaPage;

    @Before
    public void setUpYoutube(){
        userWikipedia.can(BrowseTheWeb.with(webdriver));
    }

    @When("los usuarios ingresen a la pagina principal de wikipedia")
    public void losUsuariosIngresenALaPaginaPrincipalDeWikipedia() {
      userWikipedia.wasAbleTo(AbrirNavegador.at(wikipediaPage));
    }
    @Then("ellos podran visualizar un titulo de (.*)$")
    public void ellosPodranVisualizarUnTituloDe(String tituloWiki) {
        userWikipedia.should(seeThat(ValidarTituloWikipedia.delInicio(tituloWiki)));
    }
    @When("le de click en el buscador y busque la palabra (.*)$")
    public void leDeClickEnElBuscadorYBusqueLaPalabra(String palabraBusqueda) {
        userWikipedia.attemptsTo(BusquedaWikipedia.para(palabraBusqueda));
    }
    @Then("podra visualizar en el texto el subtitulo Analisis CEEM")
    public void podraVisualizarEnElTextoElSubtituloAnalisisCEEM() {
        userWikipedia.should(seeThat(ValidarTextoWikipedia.conPalabra()));
    }
}
