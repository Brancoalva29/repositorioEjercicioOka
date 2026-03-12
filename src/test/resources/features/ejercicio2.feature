
Feature: Ingresar datos en un formulario

  Background: Ingresa todos los datos de un formulario, que sea dinamico y que contenga selects

  @Ejercicio2
    Scenario Outline: Ingresar datos en un formulario
      Given como usuario quiero ingresar a la pagina demoqa
      When ingreso el nombre <nombre> y apellido <apellido>
      And ingreso el email <email>
      And elijo el genero <genero>
      And ingreso el numero movil <numero>
      And ingreso el dia <dia>, mes <mes>, ano <ano>
      And elijo el hobbies <hobbie>
      And ingreso una direccion <direccion>
      #And elijo un estado <estado> y su ciudad <ciudad>
      And hago clic en submit
      Then me debe mostrar el form de envio

      Examples:
        | nombre | apellido | email          | genero | numero     | dia | mes | ano  | hobbie | direccion | estado | ciudad |
        | branco | alva     | test@gmail.com | Male   | 9420215281 | 29  | 12  | 1998 | Music  | Viru 123  | NCR    | Delhi  |


