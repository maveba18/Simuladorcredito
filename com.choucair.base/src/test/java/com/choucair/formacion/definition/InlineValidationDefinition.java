package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.InlineValidationSteps;
import com.choucair.formacion.steps.colorlibFormValidationSteps3;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InlineValidationDefinition {
	
	@Steps
	InlineValidationSteps inlineValidationSteps;
	@Steps
	colorlibFormValidationSteps3 colorlibFormValidationSteps3;
	
	
	@Given("^Ingreso a la funcionalidad Forms validations$")
	public void ingreso_a_la_funcionalidad_Forms_validations() {
		inlineValidationSteps.ingresar_forms_validations();
	    
	}

	@When("^Diligencio Formulario Inline Validation$")
	public void diligencio_Formulario_Inline_Validation(DataTable dtDatosForm) {
		List<List<String>> data = dtDatosForm.raw();	
		 for(int i=3; i<data.size(); i++) {
			colorlibFormValidationSteps3.diligenciar_inline_datos_tabla(data, 3);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e){}
		}
	}

	@Then("^Verifico ingresos exitosos$")
	public void verifico_ingresos_exitosos() {
		colorlibFormValidationSteps3.verificar_ingresos_datos_formulario_exitosos();
	}
	
	@Then("^Verificar que se presente Globo Informativo de validaciones$")
	public void verificar_que_se_presente_Globo_Informativo_de_validaciones() {
		colorlibFormValidationSteps3.verificar_ingreso_datos_formulario_con_errores2();
	}
}


