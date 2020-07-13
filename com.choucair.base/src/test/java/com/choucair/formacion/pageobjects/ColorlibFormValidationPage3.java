package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

	public class ColorlibFormValidationPage3 extends PageObject {
		//Campo Required2
		    @FindBy(xpath="//*[@id='required2']")
		    public WebElementFacade txtRequired2;
		//Campo Email2
		    @FindBy(id="email2")
		    public WebElementFacade txtEmail2;
	    //Campo Password1
		    @FindBy(id="pass1")
		    public WebElementFacade txtPass3;
	    //Campo Password2
		    @FindBy(id="pass2")
		    public WebElementFacade txtPass4;
		//Campo Date
		    @FindBy(id="date3")
		    public WebElementFacade txtDate2;
		//Campo Url2
		    @FindBy(xpath="//*[@id='url2']")
			public WebElementFacade txtUrl2;
	    //Campo Minimum 3 Chars
		    @FindBy(id="minimum")
		    public WebElementFacade txtMinimum;
	    //Campo Maximum 6 Chars
		    @FindBy(name="maximum")
		    public WebElementFacade txtMaximum;
	    //Campo Minimum
		    @FindBy(id="Minimum1")
		    public WebElementFacade txtMinimum1;
		//Campo Maximum
		    @FindBy(id="Maximum1")
		    public WebElementFacade txtMaximum1;
	    
	    
		    public void Required2(String datoPrueba) {
		    	txtRequired2.click();
		    	txtRequired2.clear();
		    	txtRequired2.sendKeys(datoPrueba);
		}
		    public void email2(String datoPrueba) {
		    	txtEmail2.click();
		    	txtEmail2.clear();
		    	txtEmail2.sendKeys(datoPrueba);
		}
		    public void password2(String datoPrueba) {
		    	txtPass3.click();
		    	txtPass3.clear();
		    	txtPass3.sendKeys(datoPrueba);
		}
		    public void confirm_password2(String datoPrueba) {
		    	txtPass4.click();
		    	txtPass4.clear();
		    	txtPass4.sendKeys(datoPrueba);
		}
		    public void  date2(String datoPrueba) {
		    	txtDate2.click();
		    	txtDate2.clear();
		    	txtDate2.sendKeys(datoPrueba);
		}
		    public void url2(String datoPrueba) {
		    	txtUrl2.click();
		    	txtUrl2.clear();
		    	txtUrl2.sendKeys(datoPrueba);
		}
		    public void minimum(String datoPrueba) {
		    	txtMinimum.click();
		    	txtMinimum.clear();
		    	txtMinimum.sendKeys(datoPrueba);
		}
		    public void maximum(String datoPrueba) {
		    	txtMaximum.click();
		    	txtMaximum.clear();
		    	txtMaximum.sendKeys(datoPrueba);
		}
		    public void minimum1_field_size(String datoPrueba) {
		    	txtMinimum1.click();
		    	txtMinimum1.clear();
		    	txtMinimum1.sendKeys(datoPrueba);
		}
		    public void maximum1_field_size(String datoPrueba) {
		    	txtMaximum1.click();
		    	txtMaximum1.clear();
		    	txtMaximum1.sendKeys(datoPrueba);
		}
		   
		//Boton Validate
		    @FindBy(xpath="//*[@id='inline-validation']/div[11]/input")
		    public WebElementFacade btnValidate2;
		    
		    public void validate2() {
				btnValidate2.click();
		   }
		    
		 // Globo Informativo
		    @FindBy(xpath="(//DIV[@class='formErrorContent'])[3]")
		    public WebElementFacade globoInformativo;
		    
		    public void form_sin_errores() {
		    	assertThat(globoInformativo.isCurrentlyVisible(), is(true));
		    }
		    
		    public void form_con_errores(){ 
		    	assertThat(globoInformativo.isCurrentlyVisible(), is (false));
		}
	}




	
	
	
	
	
	
	
	
	