package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

	@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
	public class GrupobancolombiaIngresoPage extends PageObject{
		
		//Boton
			@FindBy(xpath="//*[@id='continuar']/form/button")
			public WebElementFacade btnContinuar;

			public void Continuar() {
				btnContinuar.click();
				
			}

			
				
			}


