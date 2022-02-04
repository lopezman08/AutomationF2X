package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import UI.SeccionSesionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class DesplegarMenuAccionesTask implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeccionSesionesPage.BTN_LIST_ACCIONES));
	}
	
	public static Performable DesplegarMenuAcciones() {
		return instrumented(DesplegarMenuAccionesTask.class);
	}

}
