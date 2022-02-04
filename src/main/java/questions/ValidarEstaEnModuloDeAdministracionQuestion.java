package questions;

import UI.ModuloDeAdministracionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarEstaEnModuloDeAdministracionQuestion implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return ModuloDeAdministracionPage.BTN_SECCION_SESIONES.resolveFor(actor).isDisplayed();
	}
	
	public static ValidarEstaEnModuloDeAdministracionQuestion IngresoAlmodulodeAdministracion() {
		return new ValidarEstaEnModuloDeAdministracionQuestion();
	}

}
