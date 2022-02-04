package UI;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class InicioDeSesionPage {
	
	public static final Target INPUT_USUARIO = Target.the("Ingresar usuario")
			.located(By.name("inpUsuarioLogin"));
	
	public static final Target INPUT_CLAVE = Target.the("Ingresar clave")
			.located(By.name("inpClaveLogin"));
	
	public static final Target BTN_INCIAR_SESION = Target.the("Boton Iniciar Sesion")
			.located(By.xpath("//body[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]"));

}
