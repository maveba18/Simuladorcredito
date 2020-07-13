package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
		@CucumberOptions (features = "src/test/resources/features/grupobancolombia/Forms/SimuladorCredito.feature", 
		  				 tags = "@CasoExitoso",
		  				 glue="com.choucair.formacion.definition")
public class RunnerTags {

}
