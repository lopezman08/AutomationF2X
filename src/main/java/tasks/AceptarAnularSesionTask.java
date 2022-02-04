package tasks;

import UI.SeccionSesionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class AceptarAnularSesionTask implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeccionSesionesPage.BTN_ACEPTAR_MENSAJE_ANULAR_SESION));		
	}

	public static Performable AceptarAnularSesion() {
		return instrumented(AceptarAnularSesionTask.class);
	}
	
}
