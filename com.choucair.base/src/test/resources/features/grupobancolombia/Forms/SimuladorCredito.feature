#Author: your.email@your.domain.com

@Regresion
Feature: Simulador Credito Libre Inversion
	Calcula el valor de la cuota o el monto que puedes solicitar de acuerdo
	con las necesidades de crédito y capacidad de pago.
	
@CasoExitoso
  Scenario: Simulación de Cuota
  	El sistema tiene la posibilidad de calcular la cuota de un préstamo
  	con la base de criterio propuestas.
  Given Ingreso al simulador  
  When Diligencio Pantalla de simulador 
  Then Verifico Resultado Generado	
  
  
@tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
