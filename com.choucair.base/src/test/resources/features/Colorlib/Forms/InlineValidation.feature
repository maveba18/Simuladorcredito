#Author: your.email@your.domain.com

@Regresion
Feature: Formulario Inline Validation
    El usuario debe poder ingresar al formulario los datos requeridos.
    Cada campo del formulario realiza validaciones de obligatoriedad,
    longitud y formato, el sistema debe presentar las validaciones respectivas
    para cada campo a través un globo informativo.

@CasoExitoso
Scenario: Diligenciamiento exitoso del formulario Inline Validation,
          no se presenta ningún mensaje de validación.
Given Autentico en colorlib con usuario "demo" y clave "demo"
  And Ingreso a la funcionalidad Forms validations
When Diligencio Formulario Inline Validation
	| Required2 |Email2           |Password1   |Password2  |Date2        | Url2                   | Please Agree to our policy |Minimum 3 Chars  |Maximum 6 Chars  | Minimum 3  | Maximum 16       |
	| Valor3    |valor3@mail.com  |valor3      |valor3     |05-06-2019   | http://www.valor3.com  |                            |345              |123456           | 456        |1234567906642345  |
Then Verifico ingresos exitosos

@CasoAlterno
Scenario: Diligenciamiento con errores del formulario Inline Validation,
          Se presenta Globo Informativo indicando error en el diligenciamiento de alguno de los campos.
Given Autentico en colorlib con usuario "demo" y clave "demo"
  And Ingreso a la funcionalidad Forms validations
When Diligencio Formulario Inline Validation
	| Required2 |Email2           |Password1   |Password2  |Date2        | Url2                   | Please Agree to our policy |Minimum 3 Chars  |Maximum 6 Chars  | Minimum 3  | Maximum 16       |
	|           |valor3@mail.com  |valor3      |valor3     |05-06-2019   | http://www.valor3.com  |                            |345              |123456           | 456        |1234567906642345  |
Then Verificar que se presente Globo Informativo de validaciones

