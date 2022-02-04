package questions;

import UI.SeccionSesionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTituloListadoDeSesionesQuestion implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		return SeccionSesionesPage.TXT_LISTADO_DE_SESIONES.resolveFor(actor).containsText("Listado de Sesiones");
	}
	
	public static ValidarTituloListadoDeSesionesQuestion VerTituloListadoDeSesiones() {
		return new ValidarTituloListadoDeSesionesQuestion();
	}

}
