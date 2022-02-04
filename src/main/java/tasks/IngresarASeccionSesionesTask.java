package tasks;

import UI.ModuloDeAdministracionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarASeccionSesionesTask implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ModuloDeAdministracionPage.BTN_SECCION_SESIONES));		
	}

	public static Performable IngresoSeccionSesiones() {
		return instrumented(IngresarASeccionSesionesTask.class);
	} 
	
}
