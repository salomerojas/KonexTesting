package co.com.konex.automation.test.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WikipediaHome {
    public static final Target VALIDAR_TITULO = Target.the("Campo para poder validar el titulo").locatedBy("//*[@class=\"main-top-header\"]");
    public static final Target CAMPO_BUSQUEDA = Target.the("Campo de busqueda para buscar").locatedBy("//input[@placeholder=\"Buscar en Wikipedia\"]");
    public static final Target VALIDAR_TEXTO= Target.the("Campo para validar el texto de la busqueda").located(By.id("Análisis_CEEM"));
    public static final Target VALIDAR_TITUTLO_BUSQUEDA = Target.the("Campo para validar el titulo principal de la busqueda").locatedBy("//*[@class=\"mw-page-title-main\"]");
    public static final Target CREAR_CUENTA = Target.the("Boton para crear la cuenta").locatedBy("//li[@id=\"pt-createaccount-2\"]//*[text()='Crear una cuenta']");
    public static final Target CAMPO_NOMBRE = Target.the("Ingresar el nombre").located(By.id("wpName2"));
    public static final Target CAMPO_CONTRASENA = Target.the("Ingresar la contraseña").located(By.id("wpPassword2"));
    public static final Target CONFIRMAR_CONTRASENA = Target.the("Confirmar contraseña").located(By.id("wpRetype"));
    public static final Target EMAIL = Target.the("Ingresar el correo").located(By.id("wpEmail"));
    public static final Target CREACION_CUENTA = Target.the("Boton para crear cuenta").located(By.id("wpCreateaccount"));
    //public static final Target VALIDAR_CAPTCHA = Target.the("Validar el mensaje del captcha").locatedBy("");
}
