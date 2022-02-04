package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import UI.SeccionSesionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class MarcarsegundoCheckListadoDeSesionesTask implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeccionSesionesPage.CHECK_SEGUNDO_SESION_DEL_LISTADO));		
	}
	
	public static Performable checkSegundaSesionDeLaLista() {
		return instrumented(MarcarsegundoCheckListadoDeSesionesTask.class);
	}

}
