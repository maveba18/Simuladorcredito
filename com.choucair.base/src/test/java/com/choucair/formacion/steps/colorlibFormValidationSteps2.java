package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.ColorlibFormValidationPage2;
import net.thucydides.core.annotations.Step;

public class colorlibFormValidationSteps2 {
	
	ColorlibFormValidationPage2  colorlibFormValidationPage2;
	
	@Step	
	public void diligenciar_block_datos_tabla(List<List<String>> data, int id){
		colorlibFormValidationPage2.Required1(data.get(id).get(0).trim());
		colorlibFormValidationPage2.email2(data.get(id).get(1).trim());
		colorlibFormValidationPage2.password1(data.get(id).get(2).trim());
		colorlibFormValidationPage2.confirm_password1(data.get(id).get(3).trim());
		colorlibFormValidationPage2.date1(data.get(id).get(4).trim());
		colorlibFormValidationPage2.url1(data.get(id).get(5).trim());
		colorlibFormValidationPage2.Digits_Only(data.get(id).get(6).trim());		
		colorlibFormValidationPage2.Range(data.get(id).get(7).trim());
		colorlibFormValidationPage2.validate1();
   }
	
	@Step
		public void verificar_ingreso_datos_formulario_exitosos() {
		colorlibFormValidationPage2.form_sin_errores();
	}
	
	@Step
		public void verificar_ingreso_datos_formulario_con_errores1() {
		colorlibFormValidationPage2.form_con_errores();
	}


}
