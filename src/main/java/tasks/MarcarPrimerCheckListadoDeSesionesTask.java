package tasks;

import UI.SeccionSesionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class MarcarPrimerCheckListadoDeSesionesTask implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeccionSesionesPage.CHECK_PRIMERA_SESION_DEL_LISTADO));
	}
	
	public static Performable checkPrimeraSesionDeLaLista() {
		return instrumented(MarcarPrimerCheckListadoDeSesionesTask.class);
	}

}
