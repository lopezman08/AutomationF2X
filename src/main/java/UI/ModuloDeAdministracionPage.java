package UI;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ModuloDeAdministracionPage {
	
	public static final Target TXT_NOMBRE_USUARIO = Target.the("Texto que contiene el nombre de usuario")
			.located(By.xpath("//body[1]/app-dashboard[1]/header[1]/ul[2]/li[2]/a[1]/span[1]"));
	
	public static final Target BTN_SECCION_SESIONES = Target.the("Boton Sesiones en el modulo de administracion")
			.located(By.xpath("//body[1]/app-dashboard[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]"));
	
}
