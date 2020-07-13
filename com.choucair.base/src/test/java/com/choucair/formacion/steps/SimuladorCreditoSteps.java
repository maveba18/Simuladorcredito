package com.choucair.formacion.steps;


import com.choucair.formacion.pageobjects.GrupobancolombiaIngresoPage;

import net.thucydides.core.annotations.Step;

public class SimuladorCreditoSteps {
	
	GrupobancolombiaIngresoPage grupobancolombiaIngresoPage;
	
	
	@Step
	public void ingreso_grupobancolombia() {
//	a.	Abrir simulador crédito libre inversión
		grupobancolombiaIngresoPage.open();
//  b.	Click en botón Continuar 
		grupobancolombiaIngresoPage.Continuar();
		
	}

}
