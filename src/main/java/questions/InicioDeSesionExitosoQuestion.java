package questions;

import UI.ModuloDeAdministracionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class InicioDeSesionExitosoQuestion implements Question<Boolean> {
	
	private final String ValidarUsuario;

	public InicioDeSesionExitosoQuestion(String validarUsuario) {
		ValidarUsuario = validarUsuario;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return ModuloDeAdministracionPage.TXT_NOMBRE_USUARIO.resolveFor(actor).containsText(ValidarUsuario);
	}
		
	public static InicioDeSesionExitosoQuestion InicioDeSesionExitoso(String ValidarUsuario) {
		return new InicioDeSesionExitosoQuestion(ValidarUsuario);
	}
	
}
