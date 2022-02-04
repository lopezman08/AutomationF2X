package UI;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SeccionSesionesPage {
	
	public static final Target TXT_LISTADO_DE_SESIONES = Target.the("Texto Listado de Sesiones")
			.located(By.xpath("//body[1]/app-dashboard[1]/div[1]/main[1]/div[1]/lista-sesiones[1]/h6[1]"));
	
	public static final Target CHECK_PRIMERA_SESION_DEL_LISTADO = Target.the("Check de la primera sesion del listado de sesiones")
			.located(By.xpath("//body[1]/app-dashboard[1]/div[1]/main[1]/div[1]/lista-sesiones[1]/sesiones[1]/div[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[1]/div[1]/input[1]"));

	public static final Target CHECK_SEGUNDO_SESION_DEL_LISTADO = Target.the("Check de la segunda sesion del listado de sesiones")
			.located(By.xpath("//body[1]/app-dashboard[1]/div[1]/main[1]/div[1]/lista-sesiones[1]/sesiones[1]/div[1]/div[2]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[2]/datatable-body-row[1]/div[2]/datatable-body-cell[1]/div[1]/input[1]"));
	
	public static final Target BTN_LIST_ACCIONES = Target.the("Desplegar listado de acciones")
			.located(By.xpath("//body[1]/app-dashboard[1]/div[1]/main[1]/div[1]/lista-sesiones[1]/sesiones[1]/div[1]/div[1]/div[1]/div[1]/barraacciones[1]/div[1]/div[4]/button[2]"));
	
	public static final Target BTN_ANULAR_SESION_DE_USUARIO = Target.the("Boton Anular sesion de usuario")
			.located(By.xpath("//body[1]/app-dashboard[1]/div[1]/main[1]/div[1]/lista-sesiones[1]/sesiones[1]/div[1]/div[1]/div[1]/div[1]/barraacciones[1]/div[1]/div[4]/ul[1]/li[1]/button[1]"));
	
	public static final Target BTN_ACEPTAR_MENSAJE_ANULAR_SESION = Target.the("Boton Aceptar en el mensaj de notificacion Anular Sesion")
			.located(By.xpath("//body[1]/app-dashboard[1]/div[1]/main[1]/div[1]/lista-sesiones[1]/sesiones[1]/accionmodal[1]/div[1]/div[1]/div[1]/div[3]/button[2]"));
	
	public static final Target TXT_MENSAJE_RESPUESTA_ANULAR_SESION_USUARIO_MAYOR_NIVEL = Target.the("Texto de la notificacion que indica que no se puede anular la sesion de un usuario de mayor nivel")
			.located(By.xpath("//body[1]/app-dashboard[1]/div[1]/main[1]/div[1]/lista-sesiones[1]/sesiones[1]/mensajemodal[1]/div[1]/div[1]/div[1]/div[2]/span[1]"));
	
	public static final Target BTN_OK_MENSAJE_RESPUESTA_ANULAR_SESION_USUARIO_MAYOR_NIVEL = Target.the("Boton OK de la notificacion que indica que no se puede anular la sesion de un usuario de mayor nivel")
			.located(By.xpath("//body[1]/app-dashboard[1]/div[1]/main[1]/div[1]/lista-sesiones[1]/sesiones[1]/mensajemodal[1]/div[1]/div[1]/div[1]/div[3]/button[1]"));
	
}
