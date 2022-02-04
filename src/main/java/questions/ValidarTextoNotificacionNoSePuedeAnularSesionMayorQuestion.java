package questions;

import UI.SeccionSesionesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTextoNotificacionNoSePuedeAnularSesionMayorQuestion implements Question<Boolean> {
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return SeccionSesionesPage.TXT_MENSAJE_RESPUESTA_ANULAR_SESION_USUARIO_MAYOR_NIVEL.resolveFor(actor).isVisible();
				
	}

	public static ValidarTextoNotificacionNoSePuedeAnularSesionMayorQuestion txtNoEsPosibleAnularSesionUsuarioMayor() {
		return new ValidarTextoNotificacionNoSePuedeAnularSesionMayorQuestion();
	}
		
}
