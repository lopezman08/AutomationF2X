package tasks;

import UI.SeccionSesionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class DesplegarAccionesYSeleccionarAnularSesionTask implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeccionSesionesPage.BTN_LIST_ACCIONES));
		actor.attemptsTo(Click.on(SeccionSesionesPage.BTN_ANULAR_SESION_DE_USUARIO));
	}
	
	public static Performable AnularSesionDeUsuario() {
		return instrumented(DesplegarAccionesYSeleccionarAnularSesionTask.class);
	}
}
