#Author: your.email@your.domain.com

@Regresion
Feature: Formulario Block Validation
    El usuario debe poder ingresar al formulario los datos requeridos.
    Cada campo del formulario realiza validaciones de obligatoriedad,
    longitud y formato, el sistema debe presentar las validaciones respectivas
    para cada campo a través un globo informativo.

@CasoExitoso
Scenario: Diligenciamiento exitoso del formulario Block Validation,
          no se presenta ningún mensaje de validación.
Given Autentico en colorlib con usuario "demo" y clave "demo"
  And Ingreso a la funcionalidad Forms validation
When Diligencio Formulario Block Validation
    | Required1 |Email1           |Password1   |Password2  |Date1        | Url1                   | Digits Only | Range [6,16]  | Please Agree to our policy |
    | Valor2    |valor2@mail.com  |valor2      |valor2     |25-01-2019   | http://www.valor2.com  | 123456      |10             |                            |
Then Verifico ingreso exitoso

@CasoAlterno
Scenario: Diligenciamiento con errores del formulario Block Validation,
          Se presenta Globo Informativo indicando error en el diligenciamiento de alguno de los campos.
Given Autentico en colorlib con usuario "demo" y clave "demo"
  And Ingreso a la funcionalidad Forms validation
When Diligencio Formulario Block Validation
    | Required1 |Email1          |Password1   |Password2  |Date1       | Url1                   | Digits Only | Range [6,16]  | Please Agree to our policy |
    | Valor2    |valor2@mail.com |valor2      |valor2     |25-01-2019  |                        | 123456      |10             |                            |
Then Verificar que se presente Globo Informativos de validación

   