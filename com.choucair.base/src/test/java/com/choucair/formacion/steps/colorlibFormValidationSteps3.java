package com.choucair.formacion.steps;

import java.util.List;
import com.choucair.formacion.pageobjects.ColorlibFormValidationPage3;
import net.thucydides.core.annotations.Step;

public class colorlibFormValidationSteps3 {
	
	ColorlibFormValidationPage3  colorlibFormValidationPage3;
	
	@Step	
	public void diligenciar_inline_datos_tabla(List<List<String>> data, int id){
		colorlibFormValidationPage3.Required2(data.get(id).get(0).trim());
		colorlibFormValidationPage3.email2(data.get(id).get(1).trim());
		colorlibFormValidationPage3.password2(data.get(id).get(2).trim());
		colorlibFormValidationPage3.confirm_password2(data.get(id).get(3).trim());
		colorlibFormValidationPage3.date2(data.get(id).get(4).trim());
		colorlibFormValidationPage3.url2(data.get(id).get(5).trim());
		colorlibFormValidationPage3.minimum(data.get(id).get(6).trim());
		colorlibFormValidationPage3.maximum(data.get(id).get(7).trim());
		colorlibFormValidationPage3.minimum1_field_size(data.get(id).get(8).trim());
		colorlibFormValidationPage3.maximum1_field_size(data.get(id).get(9).trim());
		colorlibFormValidationPage3.validate2();
	}
	
	@Step
	public void verificar_ingresos_datos_formulario_exitosos() {
		colorlibFormValidationPage3.form_sin_errores();
		
	}
	@Step
	public void verificar_ingreso_datos_formulario_con_errores2() {
		colorlibFormValidationPage3.form_con_errores();
	}

}