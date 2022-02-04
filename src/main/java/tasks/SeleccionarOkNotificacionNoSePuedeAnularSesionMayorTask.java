package tasks;

import UI.SeccionSesionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionarOkNotificacionNoSePuedeAnularSesionMayorTask implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeccionSesionesPage.BTN_OK_MENSAJE_RESPUESTA_ANULAR_SESION_USUARIO_MAYOR_NIVEL));
	}
	
	public static Performable seleccionarOkNotificaionNoSePuedeAnularSesionUsuarioMayor() {
		return instrumented(SeleccionarOkNotificacionNoSePuedeAnularSesionMayorTask.class);
	}

}
