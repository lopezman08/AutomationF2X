package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarBotonAnularSesionDeUsuarioDeshabilitadoQuestion;
import questions.ValidarEstaEnModuloDeAdministracionQuestion;
import questions.ValidarTextoNotificacionNoSePuedeAnularSesionMayorQuestion;
import questions.ValidarTituloListadoDeSesionesQuestion;
import tasks.AceptarAnularSesionTask;
import tasks.DesplegarAccionesYSeleccionarAnularSesionTask;
import tasks.DesplegarMenuAccionesTask;
import tasks.IngresarASeccionSesionesTask;
import tasks.MarcarPrimerCheckListadoDeSesionesTask;
import tasks.MarcarsegundoCheckListadoDeSesionesTask;
import tasks.SeleccionarOkNotificacionNoSePuedeAnularSesionMayorTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@RunWith(Cucumber.class)
public class SesionesSteps {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("El usuario inicia sesion exitosamente y esta ubicado en la pagina principal del Modulo de Administracion")
	public void el_usuario_incia_sesion_exitosamente_y_esta_ubicado_en_la_pagina_principal_del_modulo_de_administracion() {
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarEstaEnModuloDeAdministracionQuestion.IngresoAlmodulodeAdministracion()));
	}

	@Given("selecciona la opcion Sesiones y visualiza el listado de usuarios")
	public void selecciona_la_opcion_sesiones_y_visualiza_el_listado_de_usuarios() {
	    theActorCalled("Usuario").attemptsTo(IngresarASeccionSesionesTask.IngresoSeccionSesiones());
	    theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTituloListadoDeSesionesQuestion.VerTituloListadoDeSesiones()));
	}

	@When("Marca con un check una de las sesiones del listado que posee mayor nivel al propio")
	public void marca_con_un_check_uno_de_las_sesiones_del_listado_que_posee_mayor_nivel_al_propio() {
	    theActorCalled("Usuario").attemptsTo(MarcarPrimerCheckListadoDeSesionesTask.checkPrimeraSesionDeLaLista());
	}

	@When("despliega el menu de acciones y selecciona la opcion Anular sesion de usuario")
	public void despliega_el_menu_de_acciones_y_selecciona_la_opcion_anular_sesion_de_usuario() {
		theActorCalled("Usuario").attemptsTo(DesplegarAccionesYSeleccionarAnularSesionTask.AnularSesionDeUsuario());
	}

	@When("selecciona la opcion Aceptar del mensaje que pregunta si esta seguro de terminar la sesion del usuario seleccionado")
	public void selecciona_la_opcion_aceptar_del_mensaje_que_pregunta_si_esta_seguro_de_terminar_la_sesion_del_usuario_seleccionado() {
		theActorCalled("Usuario").attemptsTo(AceptarAnularSesionTask.AceptarAnularSesion());
	}

	@Then("visualiza un nuevo mensaje con el texto No puede anular la sesión de un Usuario con un nivel mayor al propio")
	public void visualiza_un_nuevo_mensaje_con_el_texto_No_puede_anular_la_sesión_de_un_Usuario_con_un_nivel_mayor_al_propio() {
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTextoNotificacionNoSePuedeAnularSesionMayorQuestion.txtNoEsPosibleAnularSesionUsuarioMayor()));
	}

	@Then("selecciona el boton Ok del mensaje y es direccionado nuevamente al listado de sesiones")
	public void selecciona_el_boton_ok_del_mensaje_y_es_direccionado_nuevamente_al_listado_de_sesiones() {
		theActorCalled("Usuario").attemptsTo(SeleccionarOkNotificacionNoSePuedeAnularSesionMayorTask.seleccionarOkNotificaionNoSePuedeAnularSesionUsuarioMayor());
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTituloListadoDeSesionesQuestion.VerTituloListadoDeSesiones()));
	}
	
	@When("Marca con un check dos de las sesiones del listado")
	public void marca_con_un_check_dos_de_las_sesiones_del_listado() {
		theActorCalled("Usuario").attemptsTo(MarcarPrimerCheckListadoDeSesionesTask.checkPrimeraSesionDeLaLista());
		theActorCalled("Usuario").attemptsTo(MarcarsegundoCheckListadoDeSesionesTask.checkSegundaSesionDeLaLista());
	}
	
	@When("despliega el menu de acciones")
	public void despliega_el_menu_de_acciones() {
		theActorCalled("Usuario").attemptsTo(DesplegarMenuAccionesTask.DesplegarMenuAcciones());
	}

	@Then("No puede seleccionar la opcion Anular sesion de usuario debido a que se encuentra deshabilitada")
	public void no_puede_seleccionar_la_opcion_anular_sesion_de_usuario_debido_a_que_se_encuentra_deshabilitada() {
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarBotonAnularSesionDeUsuarioDeshabilitadoQuestion.BtnAnularSesionDeshabilitado()));
	}
	
}
