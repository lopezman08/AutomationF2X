package questions;

import UI.SeccionSesionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarBotonAnularSesionDeUsuarioDeshabilitadoQuestion implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return SeccionSesionesPage.BTN_ANULAR_SESION_DE_USUARIO.resolveFor(actor).isDisabled();
	}
	
	public static ValidarBotonAnularSesionDeUsuarioDeshabilitadoQuestion BtnAnularSesionDeshabilitado() {
		return new ValidarBotonAnularSesionDeUsuarioDeshabilitadoQuestion();
	}

}
