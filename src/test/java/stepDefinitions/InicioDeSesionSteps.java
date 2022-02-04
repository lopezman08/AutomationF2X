package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.InicioDeSesionExitosoQuestion;
import tasks.InicioDeSesionTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class InicioDeSesionSteps {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("El usuario esta en la pagina de inicio de sesion de F2XT10")
	public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion_de_f2xt10() {
		theActorCalled("Usuario").attemptsTo(Open.url("http://20.122.126.220:4200/"));
	}

	@When("Ingresa las credenciales {string} y {string}")
	public void ingresa_las_credenciales_y(String usuario, String clave) {
		theActorCalled("Usuario").attemptsTo(InicioDeSesionTask.inicioDeSesion(usuario, clave));
	}

	@Then("Inicia sesion exitosamente y visualiza el nombre del usuario {string}")
	public void inicia_sesion_exitosamente_y_visualiza_el_nombre_del_usuario(String ValidarUsuario) {
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(InicioDeSesionExitosoQuestion.InicioDeSesionExitoso(ValidarUsuario)));
	}

}
