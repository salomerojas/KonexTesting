package co.com.konex.automation.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YoutubeHome {
    public static final Target INPUT_BUSQUEDA = Target.the("Input para hacer la busqueda").locatedBy("//input[@id=\"search\"]");
    public static final Target ELEGIR_CANCION =Target.the("Elegir la primera canción").locatedBy("//*[@src=\"https://i.ytimg.com/vi/e-fA-gBCkj0/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDLUoquGhrBi1Zh90JnKEdiIm-4Xg\"]");
    public static final Target VALIDAR_CANCION = Target.the("Campo para validar el nombre de la canción").locatedBy("(//*[@class=\"style-scope ytd-watch-metadata\"])[2]");
    public static final Target BOTON_ACCESO = Target.the("Boton para poder loguearse en youtube").locatedBy("(//div[@class=\"yt-spec-touch-feedback-shape__fill\"])[4]");
    public static final Target INPUT_USUARIO = Target.the("Input para ingresar el usuario").locatedBy("//input[@type=\"email\"]");
    public static final Target INPUT_CONTRASENA = Target.the("Input para ingresar la contraseña").locatedBy("//input[@type=\"password\"]");
    public static final Target VALIDAR_CUENTA = Target.the("Texto para la verificación de cuenta").locatedBy("//*[@id=\"headingText\"]//*[text()='2-Step Verification']");

}
