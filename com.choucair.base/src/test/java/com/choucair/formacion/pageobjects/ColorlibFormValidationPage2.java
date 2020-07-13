package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormValidationPage2 extends PageObject {
    //Campo Required
	    @FindBy(xpath="//*[@id='req1']")
	    public WebElementFacade txtRequired1;
	//Campo Email
	    @FindBy(id="email2")
	    public WebElementFacade txtEmail2;
    //Campo Password1
	    @FindBy(id="pass11")
	    public WebElementFacade txtPass11;
    //Campo Password2
	    @FindBy(id="pass22")
	    public WebElementFacade txtPass22;
	//Campo Date
	    @FindBy(id="date3")
	    public WebElementFacade txtDate1;
	//Campo Url
	    @FindBy(xpath="//*[@id='url1']")
		public WebElementFacade txtUrl1;   
    //Campo Digits Only
	    @FindBy(id="digits only")
	    public WebElementFacade txtDigitsOnly;
	//Campo Range
	    @FindBy(id="range")
	    public WebElementFacade txtRange;
		    
	    public void Required1(String datoPrueba) {
	    	txtRequired1.click();
	    	txtRequired1.clear();
	    	txtRequired1.sendKeys(datoPrueba);
	}
	    public void email2(String datoPrueba) {
	    	txtEmail2.click();
	    	txtEmail2.clear();
	    	txtEmail2.sendKeys(datoPrueba);
	}
	    public void password1(String datoPrueba) {
	    	txtPass11.click();
	    	txtPass11.clear();
	    	txtPass11.sendKeys(datoPrueba);
	}
	    public void confirm_password1(String datoPrueba) {
	    	txtPass22.click();
	    	txtPass22.clear();
	    	txtPass22.sendKeys(datoPrueba);
	}
	    public void  date1(String datoPrueba) {
	    	txtDate1.click();
	    	txtDate1.clear();
	    	txtDate1.sendKeys(datoPrueba);
	}
	    public void url1(String datoPrueba) {
	    	txtUrl1.click();
	    	txtUrl1.clear();
	    	txtUrl1.sendKeys(datoPrueba);
	}
	    public void Digits_Only(String datoPrueba) {
	    	txtDigitsOnly.click();
	    	txtDigitsOnly.clear();
	    	txtDigitsOnly.sendKeys(datoPrueba);
	}
	    public void Range(String datoPrueba) {
	    	txtRange.click();
	    	txtRange.clear();
	    	txtRange.sendKeys(datoPrueba);
	}
	    
	//Boton Validate
	    @FindBy(xpath="//*[@id='block-validation']/div[8]/input")
	    public WebElementFacade btnValidate1;
	    
	    public void validate1() {
			btnValidate1.click();
	   }
	// Globo Informativo
	    @FindBy(xpath="(//DIV[@class='formErrorContent'])[2]")
	    public WebElementFacade globoInformativo;
	    
	    public void form_sin_errores() {
	    	assertThat(globoInformativo.isCurrentlyVisible(), is(true));
	    }
	    
	    public void form_con_errores(){ 
	    	assertThat(globoInformativo.isCurrentlyVisible(), is (false));
	}
	  
}













