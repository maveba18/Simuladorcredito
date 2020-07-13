package com.choucair.formacion.definition;

import com.choucair.formacion.steps.SimuladorCreditoSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SimuladorCreditoDefinition {
	
	@Steps
	SimuladorCreditoSteps simuladorCreditoSteps;
	
	@Given("^Ingreso al simulador$")
	public void ingreso_al_simulador() {
		simuladorCreditoSteps.ingreso_grupobancolombia();
	
	}

	@When("^Diligencio Pantalla de simulador$")
	public void diligencio_Pantalla_de_simulador() {
	   
	}

	@Then("^Verifico Resultado Generado$")
	public void verifico_Resultado_Generado() {
	   
	}
}
