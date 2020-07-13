package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.BlockValidationSteps;
import com.choucair.formacion.steps.colorlibFormValidationSteps2;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BlockValidationDefinition {
	
	@Steps
	BlockValidationSteps blockValidationSteps;
	@Steps
	colorlibFormValidationSteps2 colorlibFormValidationSteps2;
	
	@When("^Diligencio Formulario Block Validation$")
	public void diligencio_Formulario_Block_Validation(DataTable dtDatosForm) {
		List<List<String>> data = dtDatosForm.raw();	
		 for(int i=2; i<data.size(); i++) {
			colorlibFormValidationSteps2.diligenciar_block_datos_tabla(data, 2);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e){}
	}
	  }	
	
	@Then("^Verifico ingreso exitosos$")
	public void verifico_ingreso_exitosos() {
		colorlibFormValidationSteps2.verificar_ingreso_datos_formulario_exitosos();
	}
	
	@Then("^Verificar que se presente Globo Informativos de validación$")
	public void verificar_que_se_presente_Globo_Informativos_de_validación() {
		colorlibFormValidationSteps2.verificar_ingreso_datos_formulario_con_errores1();
	}
}	

	