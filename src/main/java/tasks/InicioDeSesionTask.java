package tasks;

import UI.InicioDeSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioDeSesionTask implements Task {

	private final String usuario;
	private final String clave;
	
	public InicioDeSesionTask(String usuario, String clave) {
		
		this.usuario = usuario;
		this.clave = clave;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(usuario).into(InicioDeSesionPage.INPUT_USUARIO));
		actor.attemptsTo(Enter.theValue(clave).into(InicioDeSesionPage.INPUT_CLAVE));
		actor.attemptsTo(Click.on(InicioDeSesionPage.BTN_INCIAR_SESION));
	} 
	
	public static Performable inicioDeSesion(String usuario, String clave) {
		return instrumented(InicioDeSesionTask.class,usuario,clave);
	}
	
}
